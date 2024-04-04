package com.mongo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.entity.Employee;

@Repository("empRepo")
public interface IEmployeeRepo extends MongoRepository<Employee, String> {
	
	
	public List<Employee> findByPhoneNumberOrderByLastNameAsc(long mobileNumer);
	
	//static projections;
	interface staticDemo
	{
		String getFirstName();
		String getLastName();
	}
	interface dynamicDemo
	{
		long getPhoneNumber();
		String getEmail();
	}
	
	public List<staticDemo> findByPhoneNumber(long mobileNumber);
	
	<T> List<T> findByLastName(String fname,Class k);

}
