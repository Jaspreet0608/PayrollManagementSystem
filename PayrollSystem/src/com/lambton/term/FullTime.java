package com.lambton.term;

public class FullTime extends Employee{
	private Integer salary;
	private Integer bonus;
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public Integer getBonus() {
		return bonus;
	}
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	
	public Integer calcEarnings() {
		return this.bonus+this.salary;
	}
	@Override
	public void printMyData() {
		String employeeType = "Employee is Fulltime"; 
		super.printMyData();
		System.out.println(employeeType);
		System.out.println("Employee salary: " +getSalary()+ "bonus of employee"+getBonus() );
	}
}
