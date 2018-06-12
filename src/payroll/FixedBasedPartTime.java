/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author macstudent
 */

    public class FixedBasedPartTime extends PartTime{
	private Float fixedAmmount;
	
	public Float getFixedAmmount() 
        {
		return fixedAmmount;
	}
	public void setFixedAmmount(Float fixedAmmount) 
        {
		this.fixedAmmount = fixedAmmount;
	}
	
	public float calcEarnings() 
        {
		return (getRate()*getHoursWorked())+getFixedAmmount();
	}
    }
    

