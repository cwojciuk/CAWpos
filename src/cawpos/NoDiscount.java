/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscountInDollars(double total) {
        return total;
    }
    
}
