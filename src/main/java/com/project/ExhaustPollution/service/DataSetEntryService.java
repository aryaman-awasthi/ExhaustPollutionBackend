package com.project.ExhaustPollution.service;

import com.project.ExhaustPollution.entity.DataSet;
import com.project.ExhaustPollution.repository.DataEntryRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DataSetEntryService {
    private final DataEntryRepo dataEntryRepo;

    public DataSetEntryService(DataEntryRepo dataEntryRepo) {
        this.dataEntryRepo = dataEntryRepo;
    }

    public List<DataSet> getAll() {
        return dataEntryRepo.findAll();
    }

    public void saveEntry(DataSet dataSet) {
        dataEntryRepo.save(dataSet);
    }


}
