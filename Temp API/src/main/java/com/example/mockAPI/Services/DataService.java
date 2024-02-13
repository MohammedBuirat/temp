package com.example.mockAPI.Services;

import com.example.mockAPI.Models.CountryOffensive;
import com.example.mockAPI.Models.DateOffensive;
import com.example.mockAPI.Models.OffensiveSummary;
import com.example.mockAPI.Models.TopicSummary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    public int getNumberOfTweets(){
        return 1;
    }

    public TopicSummary getTopicSummary(){
        var topicSummary = new TopicSummary();
        return topicSummary;
    }

    public List<DateOffensive> getDateOffensiveSummary(){
        List<DateOffensive> dateOffensiveList = new ArrayList<>();
        return dateOffensiveList;
    }

    public List<CountryOffensive> getCountryOffensiveSummary(){
        List<CountryOffensive> countryOffensiveList = new ArrayList<>();
        return countryOffensiveList;
    }

    public OffensiveSummary getOffensiveSummary(){
        var offensiveSummary = new OffensiveSummary();
        return offensiveSummary;
    }

    public List<CountryOffensive> getTopCountryOffensiveSummary(int num){
        List<CountryOffensive> countryOffensiveList = new ArrayList<>();
        return countryOffensiveList;
    }
}
