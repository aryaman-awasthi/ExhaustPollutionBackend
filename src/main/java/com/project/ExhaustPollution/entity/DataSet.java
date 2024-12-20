package com.project.ExhaustPollution.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class DataSet {
    @Id
    private String _id;
    private double co;
    private double co2;
    private LocalDateTime timeStamp;
}
