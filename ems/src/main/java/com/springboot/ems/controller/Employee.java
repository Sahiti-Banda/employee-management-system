package com.springboot.ems.controller;

import java.io.Serializable;



import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;

	@Column
	private String employeename;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String firstName;

	@Column
	private String lastName;
		
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	@Override
	public String toString() {
		return employeename;

	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

