package com.css.corp.epmo.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ViewList")
public class ViewList {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="projectid")
	private String projectid;
	@Column(name="projectname")
	private String projectname;
	@Column(name="status")
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ViewList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ViewList(int id, String projectid, String projectname, String status) {
		super();
		this.id = id;
		this.projectid = projectid;
		this.projectname = projectname;
		this.status = status;
	}
}
