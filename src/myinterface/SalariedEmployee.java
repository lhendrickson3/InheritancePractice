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
public class SalariedEmployee implements Employee{
    private double yearsWorked;
    
    private double salary;
    
    private double salaryPay;
    
    public void HowManyYearsWorked (){
        yearsWorked = (Double.parseDouble(JOptionPane.showInputDialog(null, "Enter how many years have you worked?")));
    }
    
    public void YearlySalary (){
        salary = (Double.parseDouble(JOptionPane.showInputDialog(null, "What is your salary?")));
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(double yearsWorked) {
        this.yearsWorked = yearsWorked;
    }
    
     public void setSalaryPay(){
    salaryPay = (getYearsWorked() * getSalary());
    }
    
    public double getSalaryPay(){
    return salaryPay;
    }    
}
