package com.lambton.term;

public class Intern extends Employee{
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	

	//@Overide 
	public void printMyData() {
		String employeeType = "Employee is internal"; 
		
	}
	
}
