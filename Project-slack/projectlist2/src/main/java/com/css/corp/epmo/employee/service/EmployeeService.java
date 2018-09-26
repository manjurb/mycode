package com.css.corp.epmo.employee.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.corp.epmo.employee.dao.EmployeeDao;
import com.css.corp.epmo.employee.dto.Employee;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	 EmployeeDao employeeDao;
	
	@Transactional
	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

	@Transactional
	public void blockEmployee(Employee employee) {
		employeeDao.blockEmployee(employee);

	}
	
	@Transactional
	public void deleteCustomer(int id) {
		employeeDao.deleteEmployee(id);
	}
	
}
