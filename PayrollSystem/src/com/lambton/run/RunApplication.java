package com.lambton.run;

import com.lambton.term.CommisionBasedPartTime;
import com.lambton.term.Employee;
import com.lambton.term.FullTime;
import com.lambton.term.Intern;
import com.lambton.term.FixedBasedPartTime;

import com.lambton.term.Motorcycle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lambton.term.Car;

public class RunApplication {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
float totalSalary = 0;
List<Employee> listOfEmployees = new ArrayList<Employee>();
int option;
do
{
System.out.println();
System.out.println("Press 1 to add and CommsionBasedEmployee");
System.out.println("Press 2 to add and FixedBasedPartTimeEmployee");
System.out.println("Press 3 to add and FullTime Employee");
System.out.println("Press 4 to add and Intern");
System.out.println("Press 5 to calculate all the payout");

System.out.println("Press 6 to Exit out of the program");
option = sc.nextInt();;
switch (option) 
{
case 1:
CommisionBasedPartTime commissionBasedEmployee1 = new CommisionBasedPartTime();
System.out.println("Please enter the employee's name");
commissionBasedEmployee1.setName(sc.next());
System.out.println("Please enter the employee's age");
commissionBasedEmployee1.setAge(sc.nextInt());

System.out.println("Please enter the number of hours worked by Employee");
commissionBasedEmployee1.setHoursWorked(sc.nextInt());
System.out.println("Please enter the rate of commision for the Employee");
commissionBasedEmployee1.setRate(sc.nextInt());
System.out.println("Does Employee has any vehicle? Press Y for Yes N for NO");
if(sc.next().equalsIgnoreCase("y")) 
{
System.out.println("What type of vehicle does the employee has Car or Motorcycle?");
if(sc.next().equalsIgnoreCase("car"))
{
Car car1 = new Car();
car1.setCostOfFuel(100);
car1.setPlate("Jaspreet");
car1.setDistanceTravelInOneDay(90);
car1.setNumberOfDoors(2);
car1.setMake("MERC");
car1.setMilage(5);
car1.setMonthlyAttendance(10);

car1.printMyData();
}
else if(sc.next().equalsIgnoreCase("motorcycle"))
{
Motorcycle motorcycle1 = new Motorcycle();
System.out.println("Please Enter the motocycle weight");
motorcycle1.setWeight(sc.nextInt());
System.out.println("Please Enter the motocycle Make");
motorcycle1.setMake(sc.next());
System.out.println("Please Enter the motocycle Plate");
motorcycle1.setPlate(sc.next());
motorcycle1.printMyData();
}
totalSalary += commissionBasedEmployee1.calcEarnings();
commissionBasedEmployee1.printMyData();
listOfEmployees.add(commissionBasedEmployee1);
break;
}
totalSalary += commissionBasedEmployee1.calcEarnings();
commissionBasedEmployee1.printMyData();
listOfEmployees.add(commissionBasedEmployee1);
break;
case 2:
FixedBasedPartTime fixedBasePartTime1  = new FixedBasedPartTime();
System.out.println("Please enter the employee's name");
fixedBasePartTime1.setName(sc.next());
System.out.println("Please enter the employee's age");
fixedBasePartTime1.setAge(sc.nextInt());
System.out.println("Please enter the number of hours worked by Employee");
fixedBasePartTime1.setHoursWorked(sc.nextInt());
System.out.println("Please enter the rate of commision for the Employee");
fixedBasePartTime1.setRate(sc.nextInt());

 System.out.println("Please enter the fixed amount for the Employee");
 fixedBasePartTime1.setFixedAmmount(sc.nextInt());



System.out.println("Does Employee has any vehicle? Press Y for Yes N for NO");
if(sc.next().equalsIgnoreCase("y"))
{
System.out.println("What type of vehicle does the employee has Car or Motorcycle?");
if(sc.next().equalsIgnoreCase("car"))
{
Car car1 = new Car();
car1.setCostOfFuel(130);
car1.setPlate("bains");
car1.setDistanceTravelInOneDay(30);
car1.setNumberOfDoors(2);
car1.setMake("civic");
car1.setMilage(10);
car1.setMonthlyAttendance(15);
car1.printMyData();
}
else if(sc.next().equalsIgnoreCase("motorcycle"))
{
Motorcycle motorcycle1 = new Motorcycle();
System.out.println("Please Enter the motocycle weight");
motorcycle1.setWeight(sc.nextInt());
System.out.println("Please Enter the motocycle Make");
motorcycle1.setMake(sc.next());
System.out.println("Please Enter the motocycle Plate");
motorcycle1.setPlate(sc.next());
motorcycle1.printMyData();
   }       
totalSalary += fixedBasePartTime1.calcEarnings();
             fixedBasePartTime1.printMyData();
listOfEmployees.add(fixedBasePartTime1);
break;
}
totalSalary += fixedBasePartTime1.calcEarnings();
fixedBasePartTime1.printMyData();
listOfEmployees.add(fixedBasePartTime1);
break;
case 3:
FullTime fullTime1 = new FullTime();

System.out.println("Please enter the  Employee Bonus");
fullTime1.setBonus(sc.nextInt());

                    System.out.println("Please enter the  Employee salary");
fullTime1.setSalary(sc.nextInt());

                        System.out.println("Does Employee has any vehicle? Press Y for Yes N for NO");
if(sc.next().equalsIgnoreCase("y")) {
System.out.println("What type of vehicle does the employee has Car or Motorcycle?");
if(sc.next().equalsIgnoreCase("car")) {
Car car1 = new Car();
car1.setCostOfFuel(100);
car1.setPlate("simerjit");
car1.setDistanceTravelInOneDay(120);
car1.setNumberOfDoors(4);
car1.setMake("honda");
car1.setMilage(5);
car1.setMonthlyAttendance(20);

car1.printMyData();
} 
else if(sc.next().equalsIgnoreCase("motorcycle")) 
{
Motorcycle motorcycle1 = new Motorcycle();
//System.out.println("Please Enter the motocycle w3eight");
motorcycle1.setWeight(10);
System.out.println("Please Enter the motocycle Make");
motorcycle1.setMake(sc.next());
System.out.println("Please Enter the motocycle Plate");
motorcycle1.setPlate(sc.next());
motorcycle1.printMyData();
}
totalSalary += fullTime1.calcEarnings();
fullTime1.printMyData();
listOfEmployees.add(fullTime1);
break;
}
totalSalary += fullTime1.calcEarnings();
fullTime1.printMyData();
listOfEmployees.add(fullTime1);
break;
case 4: 

Intern intern1  = new Intern();
System.out.println("Please enter the employee's name");
intern1.setName(sc.next());
System.out.println("Please enter the employee's age");
intern1.setAge(sc.nextInt());

System.out.println("Please enter the School name of intern");
intern1.setSchoolName(sc.next());


                 intern1.printMyData();
System.out.println("Does Employee has any vehicle? Press Y for Yes N for NO");
if(sc.next().equalsIgnoreCase("y")) {
System.out.println("What type of vehicle does the employee has Car or Motorcycle?");
if(sc.next().equalsIgnoreCase("car")) {
Car car1 = new Car();
car1.setCostOfFuel(70);
car1.setPlate("SimeR");
car1.setDistanceTravelInOneDay(40);
car1.setNumberOfDoors(4);
car1.setMake("Audi");
car1.setMilage(5);
car1.setMonthlyAttendance(5);

}else if(sc.next().equalsIgnoreCase("motorcycle")) {
Motorcycle motorcycle1 = new Motorcycle();
System.out.println("Please Enter the motocycle weight");
motorcycle1.setWeight(sc.nextInt());
System.out.println("Please Enter the motocycle Make");
motorcycle1.setMake(sc.next());
System.out.println("Please Enter the motocycle Plate");
motorcycle1.setPlate(sc.next());
                     motorcycle1.printMyData();
                       }
                       
                        intern1.printMyData();
listOfEmployees.add(intern1);
break;
}

intern1.printMyData();
listOfEmployees.add(intern1);
break;
case 5:
System.out.println("Total Payout to employees is : "+totalSalary);


case 6:
sc.close();
System.exit(0);
break;
default:
System.out.println("Please Enter the correct option");
break;
}
}while (option != 6);
}
	            xsza
}
	            
		