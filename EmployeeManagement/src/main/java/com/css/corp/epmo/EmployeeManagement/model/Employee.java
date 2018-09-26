package com.css.corp.epmo.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.css.corp.epmo.EmployeeManagement.constant.Gender;
import com.css.corp.epmo.EmployeeManagement.constant.ProjectType;
import com.css.corp.epmo.EmployeeManagement.constant.Role;
import com.css.corp.epmo.EmployeeManagement.constant.Status;
import com.css.corp.epmo.EmployeeManagement.constant.YesNo;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private long employeeId;
	
	
	private String firstName;
	
	private String LastName;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String userName;
	
	private String password;
	
	private String mobileNumber;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Enumerated(EnumType.STRING)
	private ProjectType projectType;
	
	private String projectName;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	
	/*@Enumerated(EnumType.STRING)
	private YesNo isActive;*/


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public ProjectType getProjectType() {
		return projectType;
	}


	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	/*public YesNo getIsActive() {
		return isActive;
	}


	public void setIsActive(YesNo isActive) {
		this.isActive = isActive;
	}*/


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", gender=" + gender + ", userName=" + userName + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", role=" + role + ", projectType=" + projectType + ", projectName=" + projectName
				+ ", email=" + email + ", status=" + status + "]";
	}
	
	
	
	
	

}
