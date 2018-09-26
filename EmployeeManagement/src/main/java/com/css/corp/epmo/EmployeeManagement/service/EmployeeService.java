package com.css.corp.epmo.EmployeeManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.corp.epmo.EmployeeManagement.controller.EmployeeController;
import com.css.corp.epmo.EmployeeManagement.model.Employee;
import com.css.corp.epmo.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	Logger log=LoggerFactory.getLogger(EmployeeController.class);
	
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee addEmployee(@Valid Employee emp) {
		log.info("Add employee");
		return employeeRepository.save(emp);
	}

	public List<Employee> getAllEmployee() {
		
		log.info("Fetch all employee");
		return employeeRepository.findAll();
	}

	public List<Employee> findEmployeeByName(String employeeName) {
		log.info("Fetch employee by name");
		return employeeRepository.findByFirstName(employeeName);
	}

	public Employee blockEmployee(@Valid Employee emp) {
		log.info("Block employee by name");
		
		return employeeRepository.save(emp);
	}

	public void deleteEmployeeById(long employeeId) {
		log.info("Delete employee by id");
		employeeRepository.deleteById(employeeId);
	}

}
