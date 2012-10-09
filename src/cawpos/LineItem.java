package cawpos;

/**
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 */
public class LineItem {
    private Product p;
    private int quantity;
    
    
    public LineItem(Product p, int quantity){
        this.p = p;
        this.quantity = quantity;
    }
    public Product getItemProd(){
        
        return p;
    }
    
    public int getQuantity(){
        return quantity;
    }
    public double getOrigPriceSubtotal(){
        return p.getPrice() * quantity;
    }
    public double getDiscPriceTotal(){
        return p.getDiscountStrategy().getDiscountInDollars((p.getPrice() * quantity));
    }
    
}
