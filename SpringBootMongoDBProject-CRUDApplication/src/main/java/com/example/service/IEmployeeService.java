package com.example.service;

import java.util.Optional;

import com.example.document.Employee;

public interface IEmployeeService {
	public String addEmployee(Employee e);
	
	public Optional<Employee> getEmployeeById(Integer id);
	
	public Employee getEmployeeAge(Integer age,String name);
	
	
}
