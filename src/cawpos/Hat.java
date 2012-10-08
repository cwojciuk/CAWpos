/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class Hat extends Product{

    public Hat(String prodID, String description, double price, DiscountStrategy discountStrategy) {
        this.setProdId(prodID);
        this.setDescription(description);
        this.setPrice(price);
        this.setDiscountStrategy(discountStrategy);
    }
}
