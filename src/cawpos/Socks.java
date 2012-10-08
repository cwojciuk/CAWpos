package cawpos;



/**
 *
 * @author jlombardo
 */
public class Socks extends Product {

    public Socks(String prodID, String description, double price, DiscountStrategy discountStrategy) {
        this.setProdId(prodID);
        this.setDescription(description);
        this.setPrice(price);
        this.setDiscountStrategy(discountStrategy);
    }
    
}
