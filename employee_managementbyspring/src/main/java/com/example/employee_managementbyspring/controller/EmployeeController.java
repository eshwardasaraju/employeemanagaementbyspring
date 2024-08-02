package com.example.employee_managementbyspring.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_managementbyspring.entity.Employee;
import com.example.employee_managementbyspring.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@Autowired
	ModelMapper mapper;
	@PostMapping("/save")
	public Employee emp(@RequestBody Employee e){
		Employee m = mapper.map(e, Employee.class);
		return m;
		
		
		
		
		
		
		
	}

}
