package cawpos;

/**
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 */
public class EmployeeDiscount implements DiscountStrategy{
    private final double EMPLOYEEDISCOUNT = .7;
    @Override
    public double getDiscountInDollars(double total) {
        return total * EMPLOYEEDISCOUNT;
    }
    
}
