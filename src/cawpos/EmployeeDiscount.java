/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class EmployeeDiscount implements DiscountStrategy{
    private final double EMPLOYEEDISCOUNT = .7;
    @Override
    public double getDiscountInDollars(double total) {
        return total * EMPLOYEEDISCOUNT;
    }
    
}
