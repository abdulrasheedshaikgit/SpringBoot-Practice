package com.example.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AddressDetails {
	
	@Id
	private Integer addressId;
	private String addressType;
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private Long pincode;
	public AddressDetails(Integer addressId, String addressType, String houseNo, String street, String city,
			String state, Long pincode) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public AddressDetails() {
		super();
	}
	@Override
	public String toString() {
		return "AddressDetails [addressId=" + addressId + ", addressType=" + addressType + ", houseNo=" + houseNo
				+ ", street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	

}
