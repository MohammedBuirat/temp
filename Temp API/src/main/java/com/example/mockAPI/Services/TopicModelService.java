package com.example.mockAPI.Services;
import com.example.mockAPI.Models.Enums.*;
import org.springframework.stereotype.Service;

@Service
public class TopicModelService {

    public TopicClass ClassifyText(String text){
        return TopicClass.Politics;
    }
}
