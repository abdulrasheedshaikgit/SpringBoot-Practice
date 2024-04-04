package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.document.Employee;
import com.example.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepository employeeRepo;
	@Override
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepo.save(e).getPid()+" Registerd Successfully";
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
		return employeeRepo.findById(id);
	}
	@Override
	public Employee getEmployeeAge(Integer age,String name) {
		// TODO Auto-generated method stub
		return employeeRepo.getEmployeeBasedOnAge(age,name);
	}
}
