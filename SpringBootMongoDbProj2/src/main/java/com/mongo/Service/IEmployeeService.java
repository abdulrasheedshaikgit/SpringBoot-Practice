package com.mongo.Service;

import java.util.List;

import com.mongo.entity.Employee;
import com.mongo.repo.IEmployeeRepo.dynamicDemo;
import com.mongo.repo.IEmployeeRepo.staticDemo;

public interface IEmployeeService {
	
	public String insertEmployee(Employee e);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployees();
	
	public String updateEmployee(int id);
	
	
	public String deleteEmployee();
	
	public List<staticDemo> fetchEmployeeByMobileNumberOrderByLastName(long mobileNumber);
	<T> List<T> fetchEmployeeByLastName(String fname,Class k);

}
