/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public abstract class Product {
    private String prodId;
    private String description;
    private double price;
    private final String UNDEFINED = "undefined";
    private DiscountStrategy discountStrategy;
    
    /**
     * 
     * @return Product ID of the product object that was created
     */
    public final String getProdId() {
        return prodId;
    }
    /**
     * sets the productID of a product object
     * @param prodId 
     */
    public final void setProdId(final String prodId) {
        if(prodId == null || prodId.length() == 0) {
            this.prodId = UNDEFINED;
        }
        this.prodId = prodId;
    }

    /**
     * 
     * @return description of a product object
     */
   public final String getDescription() {
        return description;
    }
   
    public final void setDescription(final String description) {
        // No need to validate, optional
        this.description = description;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        if(price < 0) {
            this.price = 0;
        }
        this.price = price;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
