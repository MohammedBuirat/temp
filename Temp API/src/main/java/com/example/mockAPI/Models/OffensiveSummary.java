package com.example.mockAPI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OffensiveSummary {
    private int normal;
    private int offensive;
    private int hateSpeech;
}
