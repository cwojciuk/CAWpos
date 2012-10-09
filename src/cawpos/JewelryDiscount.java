/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class JewelryDiscount implements DiscountStrategy{
    private final double JEWELRYDISCOUNT = .95;
    @Override
    public double getDiscountInDollars(double total) {
        return total * JEWELRYDISCOUNT;
    }
    
}
