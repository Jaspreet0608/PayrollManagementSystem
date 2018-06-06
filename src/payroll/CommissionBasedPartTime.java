/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Narinder
 */
public class CommissionBasedPartTime extends Parttime{
    
    
    public CommissionBasedPartTime(int rate, int hourworked, String Name, int[] employeeid, int age, float calculatebirthyear, float calculateearnings) {
        super(rate, hourworked, Name, employeeid, age, calculatebirthyear, calculateearnings);
    }
    
}
