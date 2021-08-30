package com.hcl.employee.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.employee.dto.EmployeeRequestDto;
import com.hcl.employee.dto.EmployeeSalaryResponseDto;
import com.hcl.employee.exception.EmployeeException;

import com.hcl.employee.service.IEmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	
	@PostMapping("/employees")
	public ResponseEntity<String>  addEmployee(@RequestBody EmployeeRequestDto employeeRequestDto ) throws EmployeeException{
		return new ResponseEntity<String>(employeeService.addEmployee(employeeRequestDto),HttpStatus.OK);
	}

	@GetMapping("/employees")
	public ResponseEntity<Map<Double,String>> filterSalary(@RequestParam double salary) throws EmployeeException{
		return new ResponseEntity<Map<Double,String>>(employeeService.filterSalary(salary),HttpStatus.OK);
}
	
	@GetMapping("/employees/salary")
	public ResponseEntity<Map<Double,String>> filterBySalary(@RequestParam double salary) throws EmployeeException{
	return new ResponseEntity<Map<Double,String>>(employeeService.filterBySalary(salary),HttpStatus.OK);
	}
}
	
	
	

	

