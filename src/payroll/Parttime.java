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
public class PartTime {
    private Integer hoursworked;
    private Integer rate;

    public PartTime(Integer hoursworked, Integer rate) {
        this.hoursworked = hoursworked;
        this.rate = rate;
    }
    
    

    public Integer getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(Integer hoursworked) {
        this.hoursworked = hoursworked;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    void printMyData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
