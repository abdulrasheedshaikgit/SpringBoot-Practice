package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.document.AddressDetails;

public interface IAddressRepository extends MongoRepository<AddressDetails, Integer> {
public AddressDetails findByAddressType(String type);
}
