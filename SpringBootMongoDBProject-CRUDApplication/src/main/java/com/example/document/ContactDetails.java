package com.example.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ContactDetails {
	@Id
	private Integer contactId;
	private String contactNumberType;
	private String country;
	private Long contactNumber;
	public ContactDetails(Integer contactId, String contactNumberType, String country, Long contactNumber) {
		super();
		this.contactId = contactId;
		this.contactNumberType = contactNumberType;
		this.country = country;
		this.contactNumber = contactNumber;
	}
	public ContactDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ContactDetails [contactId=" + contactId + ", contactNumberType=" + contactNumberType + ", country="
				+ country + ", contactNumber=" + contactNumber + "]";
	}
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactNumberType() {
		return contactNumberType;
	}
	public void setContactNumberType(String contactNumberType) {
		this.contactNumberType = contactNumberType;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	

}
