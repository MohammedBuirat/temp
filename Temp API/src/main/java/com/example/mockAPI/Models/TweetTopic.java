package com.example.mockAPI.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.mockAPI.Models.Enums.TopicClass;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetTopic {
    private int tweetId;
    private TopicClass topic;

}
