package com.example.mockAPI.Controllers;

import com.example.mockAPI.Services.HateModelService;
import com.example.mockAPI.Services.TopicModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextClassificationController {
    private final HateModelService _hateModel;
    private final TopicModelService _topicModel;

    @Autowired
    public TextClassificationController(HateModelService hateModelService,
                                        TopicModelService topicModelService) {
        _hateModel = hateModelService;
        _topicModel = topicModelService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/classifyHate")
    public ResponseEntity<?> classifyHate(@RequestParam String text) {
        try {
            var hateClass = _hateModel.ClassifyText(text);
            return ResponseEntity.ok(hateClass);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/classifyTopic")
    public ResponseEntity<?> classifyTopic(@RequestParam String text) {
        try {
            var topicClass = _topicModel.ClassifyText(text);
            return ResponseEntity.ok(topicClass);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }
}
