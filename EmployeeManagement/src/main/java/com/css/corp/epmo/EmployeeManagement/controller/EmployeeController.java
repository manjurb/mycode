package com.css.corp.epmo.EmployeeManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.css.corp.epmo.EmployeeManagement.constant.Result;
import com.css.corp.epmo.EmployeeManagement.model.Employee;
import com.css.corp.epmo.EmployeeManagement.service.EmployeeService;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

	Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;
	
	
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> addEmployee(@ModelAttribute(name = "employee") @Valid Employee emp) {

		log.info("Request to add employee");

		Employee savedEmpoyee = employeeService.addEmployee(emp);

		return ResponseEntity.ok(Result.SUCCESS);
		
		/*return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType("application/json"))
				.body(new Response(Result.SUCCESS, savedEmpoyee.getEmployeeId()));*/
				

	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<?> getAllEmployee()
	{
		log.info("Request to fetch all employee");
		
		List<Employee> employeeList=employeeService.getAllEmployee();
		
		return ResponseEntity.ok(employeeList);
		
	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<?> findEmployeeByName(@RequestParam(value="name") String employeeName)
	{
		log.info("Request to fetch  employee by name");
		
		List<Employee> employeeFoundByName=employeeService.findEmployeeByName(employeeName);
		
		return ResponseEntity.ok(employeeFoundByName);
	
	}
	
	@PutMapping(value = "/block")
	public Employee blockEmployee(@ModelAttribute(name = "employee") @Valid Employee emp) {

		log.info("Request to add employee");

		Employee savedEmpoyee = employeeService.blockEmployee(emp);

		//return ResponseEntity.ok(Result.SUCCESS);
		return savedEmpoyee;
	}
	
	
	@DeleteMapping(value="/delete/{emp_id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable(value="emp_id") long employeeId)
	{
		log.info("Request to fetch  employee by name");
		
		employeeService.deleteEmployeeById(employeeId);
		
		return ResponseEntity.ok(Result.SUCCESS);
	
	}
	
	

}
