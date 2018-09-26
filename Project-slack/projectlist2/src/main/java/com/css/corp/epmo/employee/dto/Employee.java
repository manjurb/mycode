package com.css.corp.epmo.employee.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="employeeid")
	private String employeeid;
	
	@Column(name="employeename")
	private String employeename;
	
	@Column(name="status")
	private String status;
	
	@Column(name="email")
	String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Employee(int id, String employeeid, String employeename, String status, String email) {
		super();
		this.id = id;
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.status = status;
		this.email = email;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeid=" + employeeid + ", employeename=" + employeename + ", status="
				+ status + ", email=" + email + "]";
	}
	
}
