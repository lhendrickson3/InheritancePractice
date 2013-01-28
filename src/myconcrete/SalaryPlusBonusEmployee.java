/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
 private double bonus;
 
 private double totalPay;
 
 public SalaryPlusBonusEmployee(){
 super();
 }
 
 public void BonusPay (){
        bonus = (Double.parseDouble(JOptionPane.showInputDialog(null, "How much was your bonus?")));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay() {
        totalPay = (getSalaryPay() + getBonus());
    }
 
}
