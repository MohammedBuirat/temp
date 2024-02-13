package com.example.mockAPI.Repositories;

import com.example.mockAPI.Models.*;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SeedData {
    public static void SeedData(){
        int dataSeedNumber = readNumberFromFile();
        if(dataSeedNumber == 1){
            return;
        }

        setDataIsSeeded();
        seedCountries();
        seedTweets();
        seedTweetHate();
        seedTweetTopic();
    }


    private static int readNumberFromFile() {
        String fileName = "C:/Users/ASUS/Desktop/Temp API/src/main/java/com/example/mockAPI/Repositories/DataIsSeeded.txt";
        int number = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                number = Integer.parseInt(line.trim()); // Trim whitespace before parsing
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return number;
    }

    private static void setDataIsSeeded() {
        String fileName = "C:/Users/ASUS/Desktop/Temp API/src/main/java/com/example/mockAPI/Repositories/DataIsSeeded.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.valueOf(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void seedCountries(){
        String csvFile = "C:\\Users\\ASUS\\Desktop\\countries_modified.csv";
        String line;
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                int id = Integer.parseInt(data[5]); // Assuming id is the last field
                Country country = new Country(id, data[0], data[1], data[2], data[4]);
                System.out.println(country.getId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void seedTweets(){
        String csvFile = "C:\\Users\\ASUS\\Desktop\\text_country_date.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                int id = Integer.parseInt(data[0].trim());
                String text = data[1].trim();
                int countryId = Integer.parseInt(data[2].trim());
                String dateString = data[3].trim() + " 00:00:00"; // Concatenate ' 00:00:00' to the date string
                LocalDateTime publishDate = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                Tweet tweet = new Tweet(id, text, countryId, publishDate);
                System.out.println(tweet.getId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void seedTweetHate() {
        String csvFile = "C:\\Users\\ASUS\\Desktop\\hate_class.csv";
        String line;
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header line
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                int tweetId = Integer.parseInt(data[0].trim());
                int tweetClass = Integer.parseInt(data[1].trim());

                Enums.OffensiveClass offensiveClass;
                switch (tweetClass) {
                    case 0:
                        offensiveClass = Enums.OffensiveClass.Normal;
                        break;
                    case 1:
                        offensiveClass = Enums.OffensiveClass.Offensive;
                        break;
                    case 2:
                        offensiveClass = Enums.OffensiveClass.HateSpeech;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid tweet class: " + tweetClass);
                }

                TweetOffensive tweetOffensive = new TweetOffensive(tweetId, offensiveClass);
                System.out.println(tweetOffensive.getTweetId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void seedTweetTopic() {
        String csvFile = "C:\\Users\\ASUS\\Desktop\\topic_class.csv";
        String line;
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header line
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                int tweetId = Integer.parseInt(data[0].trim());
                int topic = Integer.parseInt(data[1].trim());

                Enums.TopicClass tweetTopic;
                switch (topic) {
                    case 0:
                        tweetTopic = Enums.TopicClass.Sport;
                        break;
                    case 1:
                        tweetTopic = Enums.TopicClass.Politics;
                        break;
                    case 2:
                        tweetTopic = Enums.TopicClass.Technology;
                        break;
                    case 3:
                        tweetTopic = Enums.TopicClass.Religion;
                        break;
                    case 4:
                        tweetTopic = Enums.TopicClass.Health;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid topic: " + topic);
                }

                TweetTopic tweetTopicObj = new TweetTopic(tweetId, tweetTopic);
                System.out.println(tweetTopicObj.getTweetId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}