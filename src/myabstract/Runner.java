/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author User
 */
public class Runner {
  public static void main(String[] args){
  myconcrete.HourlyEmployee myEmployee = new myconcrete.HourlyEmployee();
  myEmployee.HowManyHoursWorked();
  myEmployee.PayPerHour();
  myEmployee.setPay();
  myEmployee.setAmountPaid(myEmployee.getPay());
      System.out.println("Amount paid " + myEmployee.getAmountPaid());
      
  myconcrete.SalariedEmployee mySalariedEmployee = new myconcrete.SalariedEmployee();
  mySalariedEmployee.HowManyYearsWorked();
  mySalariedEmployee.YearlySalary();
  mySalariedEmployee.setSalaryPay();
  mySalariedEmployee.setAmountPaid(mySalariedEmployee.getSalaryPay());
  System.out.println("Salary paid " + mySalariedEmployee.getSalaryPay());
  
  
  myconcrete.SalaryPlusBonusEmployee myBonusEmployee = new myconcrete.SalaryPlusBonusEmployee();
  myBonusEmployee.HowManyYearsWorked();
  myBonusEmployee.YearlySalary();
  myBonusEmployee.BonusPay();
  myBonusEmployee.setSalaryPay();
  myBonusEmployee.setTotalPay();
  System.out.println("Total salary (plus bonus) paid " + myBonusEmployee.getTotalPay());
  
  }     
}
