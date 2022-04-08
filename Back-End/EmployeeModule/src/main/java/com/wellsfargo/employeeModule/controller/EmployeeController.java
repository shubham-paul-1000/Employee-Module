package com.wellsfargo.employeeModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.employeeModule.model.Employee;
import com.wellsfargo.employeeModule.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:8000")
@RestController
@RequestMapping("/employeeManagement")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employeeList")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/editEmployee")
	public ResponseEntity<String> updateLocation(@RequestBody Employee employee)
	{
		return employeeService.updateLocation(employee);
	}
}
