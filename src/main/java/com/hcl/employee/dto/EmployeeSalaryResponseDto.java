package com.hcl.employee.dto;

public class EmployeeSalaryResponseDto {
	
	private double salary;
	private String empName;
	
	public EmployeeSalaryResponseDto() {
		
	}
	

	public EmployeeSalaryResponseDto(double salary,String empName) {
		super();
		this.salary = salary;
		this.empName=empName;
		
	}
	



	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
	

}
