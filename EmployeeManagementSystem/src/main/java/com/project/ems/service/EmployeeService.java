package com.project.ems.service;

import java.util.List;

import com.project.ems.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	void deleteEmployeeById(Long id);

	Employee updateEmployeeById(Employee existingEmployee);

	Employee getEmployeeById(Long id);
}
