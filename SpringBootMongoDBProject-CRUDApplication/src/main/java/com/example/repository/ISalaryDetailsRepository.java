package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.document.SalaryDetails;

public interface ISalaryDetailsRepository extends MongoRepository<SalaryDetails, Integer> {

}
