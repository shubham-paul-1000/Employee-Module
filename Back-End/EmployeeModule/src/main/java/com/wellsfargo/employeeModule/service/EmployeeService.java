package com.wellsfargo.employeeModule.service;
import com.wellsfargo.employeeModule.exception.RecordAlreadyPresentException;
import com.wellsfargo.employeeModule.model.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wellsfargo.employeeModule.repository.IEmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	IEmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public ResponseEntity<String> addEmployee(Employee employee)
	{
		Optional<Employee> findUId = employeeRepo.findById(employee.getUId());
		Employee findEmail = employeeRepo.findByEmail(employee.getEmailId());
		
		try
		{
			if(findUId.isPresent() && findEmail!=null)
			{
				throw new RecordAlreadyPresentException("UId and EmailId already Present");
			}
			else if(findUId.isPresent())
			{
				throw new RecordAlreadyPresentException("UId already Present");
			}
			else if(findEmail!=null)
			{
				throw new RecordAlreadyPresentException("EmailId already Present");
			}
			else
			{
				employeeRepo.save(employee);
				return new ResponseEntity<String>("Successfully Added Employee Details",HttpStatus.OK);
			}
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.ALREADY_REPORTED);
		}
	}
	public ResponseEntity<String> updateLocation(Employee employee){
		employeeRepo.save(employee);
		return new ResponseEntity<String>("Successfully updated location",HttpStatus.OK);
	}
}