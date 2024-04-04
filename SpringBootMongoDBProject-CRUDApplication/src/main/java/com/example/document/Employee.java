package com.example.document;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Employee {
	
	@Id
	private Integer pid;
	private String name;
	private Integer age;
	private Map<String,ContactDetails> contactDetails;
	private Map<String,AddressDetails> addressDetails;
	private List<SalaryDetails> salaryDetails;
	private Map<String,LeaveDetails> leaveDetails;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Map<String, ContactDetails> getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(Map<String, ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Map<String, AddressDetails> getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(Map<String, AddressDetails> addressDetails) {
		this.addressDetails = addressDetails;
	}
	public List<SalaryDetails> getSalaryDetails() {
		return salaryDetails;
	}
	public void setSalaryDetails(List<SalaryDetails> salaryDetails) {
		this.salaryDetails = salaryDetails;
	}
	public Map<String, LeaveDetails> getLeaveDetails() {
		return leaveDetails;
	}
	public void setLeaveDetails(Map<String, LeaveDetails> leaveDetails) {
		this.leaveDetails = leaveDetails;
	}
	public Employee(Integer pid, String name, Integer age, Map<String, ContactDetails> contactDetails,
			Map<String, AddressDetails> addressDetails, List<SalaryDetails> salaryDetails,
			Map<String, LeaveDetails> leaveDetails) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.contactDetails = contactDetails;
		this.addressDetails = addressDetails;
		this.salaryDetails = salaryDetails;
		this.leaveDetails = leaveDetails;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", name=" + name + ", age=" + age + ", contactDetails=" + contactDetails
				+ ", addressDetails=" + addressDetails + ", salaryDetails=" + salaryDetails + ", leaveDetails="
				+ leaveDetails + "]";
	}
	
	

}
