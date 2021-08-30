package com.hcl.employee.serviceimpl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hcl.employee.dto.EmployeeRequestDto;
import com.hcl.employee.exception.EmployeeException;
import com.hcl.employee.model.Employee;
import com.hcl.employee.repository.EmployeeRepository;
import com.hcl.employee.service.IEmployeeService;




@Service
public class EmployeeServiceImpl  implements IEmployeeService{
	
	
	  public final static Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	  
	  @Autowired
	  EmployeeRepository employeeRepository;
	  
	  final static double INCREMENT_SALARY=10000;


	@Override
	public String addEmployee(EmployeeRequestDto employeeRequestDto) throws EmployeeException {
		
		String methodName="addEmployee()";
		logger.info(methodName+"called");
		 if(employeeRequestDto.getEmpAge()<18) {
			logger.error("Age should be greater than 18");
			throw new  EmployeeException("Age shold be greater than 18");
		}
		 
	   Long mobileNo = employeeRequestDto.getMobileNumber();
	   String phoneNo =String.valueOf(mobileNo);
	   if(phoneNo.length()!=10) {
			logger.error("Mobile Number should not be less than 10 Digits..Please enter correct Mobile No");
			throw new  EmployeeException("Mobile Number Should not be less than 10 digits");
			}
	   
	   Employee employee = new Employee();
	   
	  logger.info("Converting EmployeeRequestDto to Employee");
	  BeanUtils.copyProperties(employeeRequestDto,employee);
		employeeRepository.save(employee);


	    return "Employee added Successfully";
	    		
	}


	@Override
	public Map<Double,String> filterSalary(double salary) throws EmployeeException {
		
		String methodName="filterSalary()";
		logger.info(methodName+"called");		
		
	    List<Employee> employeeList=(((List<Employee>) employeeRepository.findAll()).stream().filter(emp->emp.getSalary()>salary)).
	                collect(Collectors.toList());
	    
		if(employeeList.isEmpty()) {
			logger.error("No employees having salary less than"+salary);
			throw new  EmployeeException("No employees having salary less than"+salary);
		}

	    
		    
		Map<Double,String> map = new HashMap<>();
		    employeeList.forEach(emp->{
		    	map.put(emp.getSalary(),emp.getEmpName());
		    });

		    return map;

	}


	@Override
	public Map<Double,String> filterBySalary(double salary) throws EmployeeException {
		
		String methodName="filterBySalary()";
		logger.info(methodName+"called");

		List<Employee> employeeList =  ((List<Employee>) employeeRepository.findAll()).stream()
				.filter(emp->emp.getSalary()>salary).collect(Collectors.toList());
		
		if(employeeList.isEmpty()) {
			logger.error("No employees having salary less than"+salary);
			throw new  EmployeeException("No employees having salary less than"+salary);
		}

		
		
		Map<Double,String> map = new HashMap<>();
		
		employeeList.forEach(emp->{
			map.put(emp.getSalary()+INCREMENT_SALARY, emp.getDesignation());
			//employeeRepository.save(employeeList);

		});
		return map;
	}

	
	}


