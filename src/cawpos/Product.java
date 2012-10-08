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
    private String partName;
    private String partNumber;
    private String description;
    private double price;
    private final String UNDEFINED = "undefined";
    private DiscountStrategy discountStrategy;
    
    public final double getDiscountInDollars() {
        return discountStrategy.getDiscountInDollars(price);
    }

    public final String getPartName() {
        return partName;
    }

    public final void setPartName(final String partName) {
        if(partName == null || partName.length() == 0) {
            this.partName = UNDEFINED;
        }
        this.partName = partName;
    }

    public final String getPartNumber() {
        return partNumber;
    }

    public final void setPartNumber(final String partNumber) {
        if(partNumber == null || partNumber.length() == 0) {
            this.partNumber = UNDEFINED;
        }
        this.partNumber = partNumber;
    }

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
