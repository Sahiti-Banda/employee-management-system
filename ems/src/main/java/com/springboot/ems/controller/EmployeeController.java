package com.springboot.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	

	@GetMapping("/login")
	public String test()
	{
		return "Hello World";
		
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id )
	{
		return employeeService.getEmployeeById(id);
		
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
		
	}
	
	@PostMapping("/addemployee")
	public String addinfo(@RequestBody Employee employee)
	{
		return employeeService.addemployee(employee);
	}
	

};