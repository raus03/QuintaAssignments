package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo repository;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employees emp) {
		repository.save(emp);
		return " Employee added " ;
		
	}
	
	@GetMapping("/findAllEmployees")
	public List<Employees> getEmployees(){
		return repository.findAll();
	}

}
