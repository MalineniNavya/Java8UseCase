package com.hcl.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import com.hcl.employee.dto.EmployeeRequestDto;
import com.hcl.employee.exception.EmployeeException;
import com.hcl.employee.model.Employee;



public interface IEmployeeService {
	
	public String addEmployee(EmployeeRequestDto employeeRequestDto) throws EmployeeException;
	
	public  Map<Double,String> filterSalary(double salary)throws EmployeeException;
	
	public Map<Double,String> filterBySalary(double salary) throws EmployeeException ;
	
}

	
//	public static List<EmployeeRequestDto> convertEmployeeListToEmployeeResponseDto(List<Employee> employeeList){
//		List<EmployeeRequestDto> employeeRequestDtoList =new ArrayList<>();
//		employeeList.forEach(e->{
//			
//			EmployeeRequestDto employeeRequestDto=new EmployeeRequestDto();
//			BeanUtils.copyProperties(e,employeeRequestDto);
//			employeeRequestDtoList.add(employeeRequestDto);
//			System.out.println(employeeRequestDto);
//			System.out.println(employeeRequestDtoList);
//
//		});
//		return employeeRequestDtoList;
		
	

	
	







