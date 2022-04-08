package com.wellsfargo.employeeModule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	private String uIdcode;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "profileImage")
	private String profileImage;
	@Column(name = "location")
	private String location;
	public Employee() {
	}
	public Employee(String uId, String firstName, String lastName, String emailId, String profileImg, String location) {
		super();
		this.uIdcode = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.profileImage = profileImg;
		this.location = location;
	}
	public String getUId() {
		return uIdcode;
	}
	public void setUId(String uId) {
		this.uIdcode = uId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImg) {
		this.profileImage = profileImg;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
