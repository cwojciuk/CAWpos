/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class DiscountService {
    private DiscountStrategy discountStrategy;
    
    public DiscountService(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
    
    public final double getDiscount(double total){
        return discountStrategy.getDiscountInDollars(total);
    }
}
