package com.example.employee_managementbyspring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employee_managementbyspring.entity.Employee;
import com.example.employee_managementbyspring.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee saveEmp(Employee e) {
		return repo.save(e);
		
	}
	

}
