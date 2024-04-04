package com.example.runner;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.document.AddressDetails;
import com.example.document.ContactDetails;
import com.example.document.LeaveDetails;
import com.example.document.SalaryDetails;
import com.example.service.AddressDetailsServiceImpl;
import com.example.service.EmployeeServiceImpl;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeServiceImpl employeeImpl;
	@Autowired
	private AddressDetailsServiceImpl addressImpl;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//child address Details
		AddressDetails addr1 = new AddressDetails(new Random().nextInt(10000), "Permenant", "6-154/B", "Muslim Street", "Gunter", "Andhra Pradesh", 522015L);
		AddressDetails addr2 = new AddressDetails(new Random().nextInt(10000), "Current", "6-154/B", "Muslim Street", "Gunter", "Andhra Pradesh", 522015L);
		
		//child ContactDetails
		ContactDetails contactDetails1 = new ContactDetails(new Random().nextInt(10000), "Personal", "India", 8297369773L);
		ContactDetails contactDetails2 = new ContactDetails(new Random().nextInt(10000), "Office", "India", 7286056026L);
		
		//
		
		LeaveDetails leaveDetails1 = new LeaveDetails(new Random().nextInt(10000), "Causal leave",java.sql.Date.valueOf("2024-04-4"),java.sql.Date.valueOf("2024-04-17"), true);
		LeaveDetails leaveDetails2 = new LeaveDetails(new Random().nextInt(10000), "Earned leave",java.sql.Date.valueOf("2024-04-17"),java.sql.Date.valueOf("2024-04-19"), false);
		
		
		//
		SalaryDetails salaryDetails1 = new SalaryDetails(new Random().nextInt(10000),"March",31,210000.0);
		SalaryDetails salaryDetails2 = new SalaryDetails(new Random().nextInt(10000),"Feb",29,210000.0);
		
		
//		Employee Emp 
//		= 
//		new Employee(new Random().nextInt(10000),"Rasheed",24,Map.of(contactDetails1.getContactNumberType(),contactDetails1,contactDetails2.getContactNumberType(),contactDetails2),Map.of(addr1.getAddressType(),addr1,addr2.getAddressType(),addr2),List.of(salaryDetails1,salaryDetails2),Map.of(leaveDetails1.getLeaveType(), leaveDetails1, leaveDetails2.getLeaveType(), leaveDetails2));
//		System.out.println(employeeImpl.addEmployee(Emp));
		//System.out.println(addressImpl.getAddressDetailsById(2904));
		
		System.out.println(employeeImpl.getEmployeeAge(24,"Rasheed"));
	}

}
