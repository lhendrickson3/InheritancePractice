/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public abstract class Employee {
    
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
    
    abstract public void doSomething();
    
}
