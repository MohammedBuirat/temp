package com.example.mockAPI.Services;
import com.example.mockAPI.Models.Enums.*;
import org.springframework.stereotype.Service;

@Service
public class HateModelService {

    public OffensiveClass ClassifyText(String text){
        return OffensiveClass.Offensive;
    }
}
