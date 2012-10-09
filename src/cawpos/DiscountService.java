package cawpos;

/**
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
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
