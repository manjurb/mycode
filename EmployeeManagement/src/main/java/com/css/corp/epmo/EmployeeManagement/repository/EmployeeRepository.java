package com.css.corp.epmo.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.css.corp.epmo.EmployeeManagement.model.Employee;
import java.lang.String;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findByFirstName(String firstname);

}
