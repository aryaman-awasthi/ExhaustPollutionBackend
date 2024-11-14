package com.project.ExhaustPollution;

import com.project.ExhaustPollution.repository.DataEntryRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories

public class ExhaustPollutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExhaustPollutionApplication.class, args);
	}

}
