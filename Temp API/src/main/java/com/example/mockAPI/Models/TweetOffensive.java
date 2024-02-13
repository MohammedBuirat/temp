package com.example.mockAPI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.mockAPI.Models.Enums.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TweetOffensive {
    private int tweetId;
    private OffensiveClass offensiveClass;
}
