package com.example.employee_managementbyspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_managementbyspring.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
