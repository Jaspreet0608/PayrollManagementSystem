package com.lambton.term;

public class Motorcycle extends Vehicle{
	private float Weight;

	public float getWeight() {
		return Weight;
	}

	public void setWeight(float Weight) {
		this.Weight = Weight;
	}
	@Override
	public void printMyData() {
		System.out.println("Employee has a Motorcycle");
		super.printMyData();
		System.out.println("-"+getWeight());
	}
}
