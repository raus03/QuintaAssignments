package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employees emp) {
		employeeRepo.save(emp);
		return " Employee added " ;
		
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employees> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/getAllEmployees/{id}")
	public Optional<Employees> getEmployee(@PathVariable String id){
		return employeeRepo.findById(id);
	}

}
