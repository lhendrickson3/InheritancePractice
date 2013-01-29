/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class HourlyEmployee implements Employee{
    private double hoursWorked;
    
    private double hourlyWage;
   
    private double pay;
    
    public void HowManyHoursWorked (){
    hoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter how many hours you worked."));
    }
    
    public double getHoursWorked(){
    return hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked){
    this.hoursWorked = hoursWorked;
    }
    
    public void PayPerHour (){
    hourlyWage = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you get paid per hour."));
    }
    
    public double getHourlyWage(){
    return hourlyWage;
    }
    
    public void setHourlyWage(double hourlyWage){
    this.hourlyWage = hourlyWage;
    }
    
    public void setPay(){
    pay = (hoursWorked * hourlyWage);
    }
    
    public double getPay(){
    return pay;
    }    
}
