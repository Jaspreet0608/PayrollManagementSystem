package com.lambton.term;

public class Car extends Vehicle{
	private int numberOfDoors;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		
	}
		@Override
		public void printMyData() {
			System.out.println("Employee has a CAR");
			super.printMyData();
			System.out.println("-"+getNumberOfDoors());
	}
	
}
