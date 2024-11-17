package com.project.ExhaustPollution.controller;

import com.project.ExhaustPollution.entity.DataSet;
import com.project.ExhaustPollution.service.DataSetEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/exhaustData")
public class apiController {
    @Autowired
    private DataSetEntryService dataSetEntryService;

    @GetMapping
    public ResponseEntity<?> getExhaustData() {
        try {
            return new ResponseEntity<>(dataSetEntryService.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Boolean> createDataSet(@RequestBody DataSet dataSet) {
        try {
            dataSet.setTimeStamp(LocalDateTime.now());
            dataSetEntryService.saveEntry(dataSet);
            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/length")
    public ResponseEntity<?> getLength() {
        try {
            return new ResponseEntity<>(dataSetEntryService.getAll().size(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
