package com.lambton.run;

import com.lambton.term.Car;
import com.lambton.term.CommisionBasedPartTime;
import com.lambton.term.FixedBasedPartTime;
import com.lambton.term.Motorcycle;

public class RunApplication {
	public static void main(String[] args) {
		CommisionBasedPartTime commissionBasedEmployee1 = new CommisionBasedPartTime();
		Motorcycle motorcycle1 = new Motorcycle();
		motorcycle1.setKerbWeight(100);
		motorcycle1.setMake("Harley");
		motorcycle1.setPlate("Student");
		commissionBasedEmployee1.setAge(23);
		commissionBasedEmployee1.setName("Jaspreet");
		commissionBasedEmployee1.setHoursWorked(40);
		commissionBasedEmployee1.setRate(20);
		commissionBasedEmployee1.setCommissionPerc(20);		
		commissionBasedEmployee1.setVehicle(motorcycle1);
		commissionBasedEmployee1.printMyData();
		commissionBasedEmployee1.getVehicle().printMyData();
		
		
		CommisionBasedPartTime commissionBasedEmployee2 = new CommisionBasedPartTime();
		Car car1 = new Car();
		car1.setNumberOfDoors(4);
		car1.setMake("HONDA");
		car1.setPlate("CIVIC");
		commissionBasedEmployee2.setAge(27);
		commissionBasedEmployee2.setName("SIMER");
		commissionBasedEmployee2.setHoursWorked(20);
		commissionBasedEmployee2.setRate(14);
		commissionBasedEmployee2.setCommissionPerc(0);		
		commissionBasedEmployee2.setVehicle(car1);
		commissionBasedEmployee2.printMyData();
		commissionBasedEmployee2.getVehicle().printMyData();
		
		
		FixedBasedPartTime FixedBasedEmployee1 = new FixedBasedPartTime();
		Car car2 = new Car();
		car2.setNumberOfDoors(2);
		car2.setMake("DODGE");
		car2.setPlate("CHARGER");
		FixedBasedEmployee1.setAge(27);
		FixedBasedEmployee1.setName("SIMRANJIT");
		FixedBasedEmployee1.setHoursWorked(30);
		FixedBasedEmployee1.setRate(10);
		FixedBasedEmployee1.setFixedAmmount(40);		
		FixedBasedEmployee1.setVehicle(car2);
		FixedBasedEmployee1.printMyData();
		FixedBasedEmployee1.getVehicle().printMyData();
		
		
		sd
		
	}
}
