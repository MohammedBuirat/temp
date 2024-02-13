package com.example.mockAPI.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicSummary {
    private int health;
    private int politics;
    private int sport;
    private int technology;
    private int religion;
}
