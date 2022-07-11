package com.project.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.ems.entity.Employee;
import com.project.ems.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/employee/new")
	public String createNewEmployee(Model model) {
	
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("ëmployee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:employees";
	}
	
	@GetMapping("/employees/update/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "update_employee";
	}
	
	@PostMapping("/employees/update/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("employee") Employee employee, Model model) {
		Employee existingEmployee = employeeService.getEmployeeById(id);
		existingEmployee.setId(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());	
		employeeService.updateEmployeeById(existingEmployee);
		return "redirect:/employees";		
	}
		
	@GetMapping("/employees/{id}")
	public String deleteStudent(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
}
