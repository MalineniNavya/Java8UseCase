package com.hcl.employee.exception;

public class EmployeeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	String message;

	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	public EmployeeException() {
		super();
	}

	
	

}
