package com.project.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.ems.entity.Employee;
import com.project.ems.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee emp1 = new Employee("Jane", "Doe", "janeDoe@gmail.com");
//		employeeRepository.save(emp1); 
//		Employee emp2 = new Employee("John", "Wick", "johnWicky@gmail.com");
//		employeeRepository.save(emp2);
	}

}
