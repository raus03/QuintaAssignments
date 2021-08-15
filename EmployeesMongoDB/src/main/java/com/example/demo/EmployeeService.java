package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employees> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
	public List<Employees> getAllEmployeeRegion(String region){
		return employeeRepo.findByRegion(region);
	}
	
	

}
