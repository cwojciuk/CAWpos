/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
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
