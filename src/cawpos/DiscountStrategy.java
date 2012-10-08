/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public interface DiscountStrategy {
    public abstract double getDiscountInDollars(double total);
}
