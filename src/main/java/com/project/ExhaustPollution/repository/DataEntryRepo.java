package com.project.ExhaustPollution.repository;

import com.project.ExhaustPollution.entity.DataSet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataEntryRepo extends MongoRepository<DataSet, String> {
}
