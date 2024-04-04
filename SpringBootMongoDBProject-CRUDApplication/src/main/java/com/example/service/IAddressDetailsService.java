package com.example.service;

import java.util.Optional;

import com.example.document.AddressDetails;

public interface IAddressDetailsService {
	
	public Optional<AddressDetails> getAddressDetailsById(Integer id);
	
	public AddressDetails getEmployeeDetailsByEmployeeType(String type);

}
