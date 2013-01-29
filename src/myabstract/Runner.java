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
  HourlyEmployee myEmployee = new HourlyEmployee();
  myEmployee.HowManyHoursWorked();
  myEmployee.PayPerHour();
  myEmployee.setPay();
  myEmployee.setAmountPaid(myEmployee.getPay());
      System.out.println("Amount paid " + myEmployee.getAmountPaid());
  myEmployee.doSomething();
      
  SalariedEmployee mySalariedEmployee = new SalariedEmployee();
  mySalariedEmployee.HowManyYearsWorked();
  mySalariedEmployee.YearlySalary();
  mySalariedEmployee.setSalaryPay();
  mySalariedEmployee.setAmountPaid(mySalariedEmployee.getSalaryPay());
  System.out.println("Salary paid " + mySalariedEmployee.getSalaryPay());
  mySalariedEmployee.doSomething();
  
  
  SalaryPlusBonusEmployee myBonusEmployee = new SalaryPlusBonusEmployee();
  myBonusEmployee.HowManyYearsWorked();
  myBonusEmployee.YearlySalary();
  myBonusEmployee.BonusPay();
  myBonusEmployee.setSalaryPay();
  myBonusEmployee.setTotalPay();
  System.out.println("Total salary (plus bonus) paid " + myBonusEmployee.getTotalPay());
  
  }     
}
