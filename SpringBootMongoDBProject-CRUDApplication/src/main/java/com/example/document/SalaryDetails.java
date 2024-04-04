package com.example.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SalaryDetails {
	@Id
	private Integer salaryId;
	private String month;
	private Integer noOfDays;
	private Double amount;
	public Integer getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public SalaryDetails(Integer salaryId, String month, Integer noOfDays, Double amount) {
		super();
		this.salaryId = salaryId;
		this.month = month;
		this.noOfDays = noOfDays;
		this.amount = amount;
	}
	public SalaryDetails() {
		super();
	}
	@Override
	public String toString() {
		return "SalaryDetails [salaryId=" + salaryId + ", month=" + month + ", noOfDays=" + noOfDays + ", amount="
				+ amount + "]";
	}
	

}
