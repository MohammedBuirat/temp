package com.example.mockAPI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import com.example.mockAPI.Models.Enums.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetWithFullInfo {
    private int id;
    private String text;
    private int countryId;
    private LocalDateTime publishDate;
    private TopicClass topic;
    private OffensiveClass offensiveClass;

}
