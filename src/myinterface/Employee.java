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
public class Employee {
    private double amountPaid;
    
    public void paid() {
       JOptionPane.showMessageDialog(null, getAmountPaid());
    }
    
    public void setAmountPaid(double Value) {
        amountPaid = Value;
    }
    
    public double getAmountPaid() {
        return amountPaid;
    }    
}
