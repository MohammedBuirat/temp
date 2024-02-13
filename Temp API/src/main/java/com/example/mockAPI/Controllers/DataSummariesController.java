package com.example.mockAPI.Controllers;

import com.example.mockAPI.Services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSummariesController {

    private final DataService service;

    @Autowired
    public DataSummariesController(DataService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/topicClassification")
    public ResponseEntity<?> topicSummary() {

        try {
            var topicClassification = service.getTopicSummary();
            return ResponseEntity.ok(topicClassification);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/offensiveChart")
    public ResponseEntity<?> offensiveDate() {

        try {
            var offensiveDate = service.getDateOffensiveSummary();
            return ResponseEntity.ok(offensiveDate);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/topOffensiveRegions")
    public ResponseEntity<?> topOffensiveRegions(@RequestParam int numOfRegions) {

        try {
            var topOffensiveRegions = service.getTopCountryOffensiveSummary(numOfRegions);
            return ResponseEntity.ok(topOffensiveRegions);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/numOfTweets")
    public ResponseEntity<?> numOfTweets() {

        try {
            return ResponseEntity.ok(service.getNumberOfTweets());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/offensiveSummary")
    public ResponseEntity<?> offensiveSummary() {

        try {
            var offensiveSummary = service.getOffensiveSummary();
            return ResponseEntity.ok(offensiveSummary);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/regionsOffensive")
    public ResponseEntity<?> regionsOffensive() {

        try {
            var regionsOffensive = service.getCountryOffensiveSummary();
            return ResponseEntity.ok(regionsOffensive);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }
}
