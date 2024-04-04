package com.mongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.entity.Employee;
import com.mongo.repo.IEmployeeRepo;
import com.mongo.repo.IEmployeeRepo.dynamicDemo;
import com.mongo.repo.IEmployeeRepo.staticDemo;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo empDAO;

	@Override
	public String insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		Employee e1 = empDAO.insert(e);
		if(e1!=null)
		{
		return "inserted Successfully";
		}
		else
		{
			return "not inserted";
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDAO.findAll();
	}

	@Override
	public String updateEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<staticDemo> fetchEmployeeByMobileNumberOrderByLastName(long mobileNumber) {
		// TODO Auto-generated method stub
		return empDAO.findByPhoneNumber(mobileNumber);
	}
	@Override
	public <T> List<T> fetchEmployeeByLastName(String fname, Class k) {
		// TODO Auto-generated method stub
		return empDAO.findByLastName(fname, k);
	}
	

}
