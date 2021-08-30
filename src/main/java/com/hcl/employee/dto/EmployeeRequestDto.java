package com.hcl.employee.dto;

public class EmployeeRequestDto {
	
	
	private int empId;
	private String empName;
	private int empAge;
	private long mobileNumber;
	private String designation;
	private double salary;
	
	public EmployeeRequestDto() {
		
	}

	public EmployeeRequestDto(int empId, String empName, int empAge, long mobileNumber, String designation, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.mobileNumber = mobileNumber;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
   

}



