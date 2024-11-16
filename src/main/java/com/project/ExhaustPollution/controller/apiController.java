package com.project.ExhaustPollution.controller;

import com.project.ExhaustPollution.entity.DataSet;
import com.project.ExhaustPollution.service.DataSetEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/exhaustData")
public class apiController {
    @Autowired
    private DataSetEntryService dataSetEntryService;

    @GetMapping
    public List<DataSet> getExhaustData() {
        return dataSetEntryService.getAll();
    }

    @PostMapping
    public void createDataSet(@RequestBody DataSet dataSet) {
        dataSet.setTimeStamp(LocalDateTime.now());
        dataSetEntryService.saveEntry(dataSet);
    }

    @GetMapping("/length")
    public int getLength() {
        return dataSetEntryService.getAll().size();
    }
}
