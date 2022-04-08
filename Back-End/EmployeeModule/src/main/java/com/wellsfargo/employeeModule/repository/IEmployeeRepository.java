package com.wellsfargo.employeeModule.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wellsfargo.employeeModule.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String>{
	@Query("select email from employee where e.email = ?1")
	public Employee findByEmail(String email);
}
