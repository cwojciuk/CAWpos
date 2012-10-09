package cawpos;

/**
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 */
public interface DiscountStrategy {
    public abstract double getDiscountInDollars(double total);
}
