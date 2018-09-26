package com.css.corp.epmo.employee.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.css.corp.epmo.employee.dto.Employee;
import com.css.corp.epmo.employee.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET, headers ="Accept=application/json")
	public ModelAndView getEmployeeById(@PathVariable int id) {
		ModelAndView model= new ModelAndView("employee");
		model.addObject("employeedetails", employeeService.getEmployee(id));
		return model;
	}

	@RequestMapping(value = "/blockEmployee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String blockEmployee(@PathVariable("id") int id,Model model) {
		model.addAttribute("employee", this.employeeService.getEmployee(id));
		
		return "employeeDetails";
	}

	
}
