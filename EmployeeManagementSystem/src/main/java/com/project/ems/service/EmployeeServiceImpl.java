package com.project.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.ems.entity.Employee;
import com.project.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		 return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		 employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployeeById(Employee existingEmployee) {
		return employeeRepository.save(existingEmployee);
	}


	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}
}
