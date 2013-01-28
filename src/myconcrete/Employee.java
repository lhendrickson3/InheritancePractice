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
public class Employee {
    Integer amountPaid;
    
    public void paid() {
       JOptionPane.showMessageDialog(null, getAmountPaid());
            }
    public void setAmountPaid(Integer Value) {
        amountPaid = Value;
    }
    
    public Integer getAmountPaid() {
        return amountPaid;
    }
}
