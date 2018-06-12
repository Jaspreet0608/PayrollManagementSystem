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

    public class CommissionBasedPartTime extends PartTime implements IPrintable{
	private int commissionPerc;

	public float getCommissionPerc() {
		return commissionPerc;
	}

	public void setCommissionPerc(int commissionPerc) {
		this.commissionPerc = commissionPerc;
	}
	
	public Float calcEarnings() {
		return (getHoursWorked()*getRate())+((getHoursWorked()*getRate())*getCommissionPerc())/100;
	}
	
	@Override
	public void printMyData() {
		String employeeType = "Employee is PartTime / Commissioned"; 
		super.printMyData();
		System.out.println(employeeType);
		System.out.println("-Earnings: " + calcEarnings() 
			+ "(" + getHoursWorked() * getRate()+ " + "+getCommissionPerc() + "%)");
}

        private Integer getHoursWorked() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

