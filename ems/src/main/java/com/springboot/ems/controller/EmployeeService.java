package com.springboot.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService 
{
    
	@Autowired
	EmployeeRepository employeerepo;

    
   
	public String addemployee(Employee employee) 
	{
		Optional<Employee> existingUser = employeerepo.findByEmployeename(employee.getEmployeename());
	    
	    if (existingUser.isPresent()) {
	        
	        return "Username already exists: " + existingUser.get().getEmployeename();
	    } else {
	        Employee u = employeerepo.save(employee);
	        System.out.println(employee);
	        return "User added successfully:"+ u.getId();
	    }
	}




	public  Employee getEmployeeById(int id) 
	{
		Optional <Employee> opt= employeerepo.findById(id);
	   
		if(opt.isPresent())
		{
			return opt.get();
		}
		return null;
		
	}
	
	public  List<Employee> getAllEmployees() 
	{
	   
		return employeerepo.findAll();
		
	}
	
}

