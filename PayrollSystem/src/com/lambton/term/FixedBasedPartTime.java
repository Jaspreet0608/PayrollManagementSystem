package com.lambton.term;

public class FixedBasedPartTime extends PartTime{
	private Float fixedAmmount;
	
	public Float getFixedAmmount() {
		return fixedAmmount;
	}
	public void setFixedAmmount(float i) {
		this.fixedAmmount = i;
	}
	
	public float calcEarnings() {
		return (getRate()*getHoursWorked())+getFixedAmmount();
		
		
	}
		public void printMyData() {
			String employeeType = "Employee is PartTime / Fixed"; 
			super.printMyData();
			System.out.println(employeeType);
			System.out.println("-Earnings: " + calcEarnings()) ;
			System.out.println("Fixed amount: " + getFixedAmmount());
			//	+ "(" + getRate()* getHoursWorked() + getFixedAmmount() + ")");

	}
}
