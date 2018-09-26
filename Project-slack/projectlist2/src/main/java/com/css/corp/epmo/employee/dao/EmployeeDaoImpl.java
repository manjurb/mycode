package com.css.corp.epmo.employee.dao;



import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.css.corp.epmo.employee.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Employee> getAllEmployees() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee>  employeeList = session.createQuery("from Employee").list();
		return employeeList;
	}
	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, id);
		return employee;
		}

	
	@Override
	public Employee blockEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(employee);
		if(employee.getStatus().equals("active"))
		{
			employee.setStatus("blocked");
		}
		Employee emp=(Employee) session.save(employee);
		return emp;
	}
	
	public void deleteEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		if (null != employee) {
			session.delete(employee);
		}
	}

	


}
