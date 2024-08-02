package com.example.employee_managementbyspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.employee_managementbyspring.dao.EmployeeDao;
import com.example.employee_managementbyspring.entity.Employee;
import com.example.employee_managementbyspring.util.ResponseStructure;

public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public ResponseEntity<ResponseStructure<Employee>> emp(Employee e){
		ResponseStructure<Employee> rs=new ResponseStructure<Employee>();
		rs.setStstuscode(HttpStatus.CREATED.value());
		rs.setData(dao.saveEmp(e));
		rs.setMsg("emp saves successful");
		return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.CREATED);
	}

}
