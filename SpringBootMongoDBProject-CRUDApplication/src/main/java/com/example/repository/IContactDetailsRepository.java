package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.document.ContactDetails;

public interface IContactDetailsRepository extends MongoRepository<ContactDetails, Integer> {

}
