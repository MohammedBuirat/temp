package com.example.mockAPI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tweet {
    private int id;
    private String text;
    private int countryId;
    private LocalDateTime publishDate;
}
