package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.document.AddressDetails;
import com.example.repository.IAddressRepository;

@Service("addressService")
public class AddressDetailsServiceImpl implements IAddressDetailsService {

	@Autowired
	private IAddressRepository addressRepo;
	@Override
	public Optional<AddressDetails> getAddressDetailsById(Integer id) {
		// TODO Auto-generated method stub
		
		return addressRepo.findById(id);
		
	}
	@Override
	public AddressDetails getEmployeeDetailsByEmployeeType(String type) {
		// TODO Auto-generated method stub
		return addressRepo.findByAddressType(type);
	}

}
