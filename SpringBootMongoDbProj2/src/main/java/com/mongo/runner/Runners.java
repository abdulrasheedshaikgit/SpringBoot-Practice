package com.mongo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.mongo.Service.EmployeeServiceImpl;
import com.mongo.repo.IEmployeeRepo.dynamicDemo;

@Component
public class Runners implements ApplicationRunner{

	@Autowired
	private EmployeeServiceImpl impl;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(impl.insertEmployee(new
		 * Employee(104,"Yellagari","Pavan Kumar Reddy","pavan@gmail.com",888888888)));
		 * System.out.println(impl.insertEmployee(new
		 * Employee(105,"Seru","Phani","phani@gmail.com",666666666)));
		 */
		//impl.getAllEmployees().forEach(System.out::println);
		
		System.out.println("Runners.run()");
		impl.fetchEmployeeByMobileNumberOrderByLastName(829736977).forEach(System.out::println);
		System.out.println("Runners.run()");
		impl.fetchEmployeeByLastName("Kiran",dynamicDemo.class).forEach(System.out::println);
	}

}
