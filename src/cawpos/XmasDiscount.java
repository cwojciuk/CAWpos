/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class XmasDiscount implements DiscountStrategy{
    private final double XMASDISCOUNT = .9;

    @Override
    public double getDiscountInDollars(double total) {
        return total * XMASDISCOUNT;
    }
    
}
