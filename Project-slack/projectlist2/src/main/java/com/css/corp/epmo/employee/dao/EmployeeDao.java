package com.css.corp.epmo.employee.dao;

import com.css.corp.epmo.employee.dto.Employee;

public interface EmployeeDao {

	public Employee getEmployee(int id);
	
	public Employee blockEmployee(Employee employee);
	
	public void deleteEmployee(int id);
}
