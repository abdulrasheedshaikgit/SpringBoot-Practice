package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, Integer> {

	@Query(fields="{id:1,name:1,age:1}",value="{age:?0,name:?1}")
	public Employee getEmployeeBasedOnAge(Integer age,String name);
	
}
