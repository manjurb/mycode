package com.css.corp.epmo.project.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ViewEmp {

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
	public ViewEmp(int id, String employeeid, String employeename, String status) {
		super();
		this.id = id;
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.status = status;
	}
	public ViewEmp() {
		super();
	}
	
}
