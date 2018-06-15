package com.lambton.term;

public class Car extends Vehicle{
	private int numberOfDoors;
	private int CostOfFuel;
	private String Plate;
	private int DistanceTravelInOneDay;
	
	private String Make;
	private int Milage;
	private	int MonthlyAttendance;
	
	
	

	public int getCostOfFuel() {
		return CostOfFuel;
	}

	public void setCostOfFuel(int costOfFuel) {
		CostOfFuel = costOfFuel;
	}

	public String getPlate() {
		return Plate;
	}

	public void setPlate(String plate) {
		Plate = plate;
	}

	public int getDistanceTravelInOneDay() {
		return DistanceTravelInOneDay;
	}

	public void setDistanceTravelInOneDay(int distanceTravelInOneDay) {
		DistanceTravelInOneDay = distanceTravelInOneDay;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public int getMonthlyAttendance() {
		return MonthlyAttendance;
	}

	public void setMonthlyAttendance(int monthlyAttendance) {
		MonthlyAttendance = monthlyAttendance;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getMilage() {
		return Milage;
	}

	public void setMilage(int milage) {
		Milage = milage;
	}
	
}
