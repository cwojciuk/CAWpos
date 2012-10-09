/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class CashRegister {
    Receipt receipt = new Receipt();
    
    /*
     * Creation of "Database" with product values
     * used to check items being sent in by the user
     */
    Product[] products = {
        new Hat("A101", "Baseball Hat", 19.95, new XmasDiscount()),
        new Shirt("B205", "Men's Dress Shirt", 35.50, new EmployeeDiscount()),
        new Socks("C222", "Women's Socks", 9.50, new NoDiscount()),
        new Ring("R432", "Diamond Ring", 499.99, new NoDiscount()),
        new Shoes("S934", "Nike Free Run 2.0", 89.99, new XmasDiscount()),
        new Necklace("N843", "Emerald Necklace", 225.75, new JewelryDiscount())
    };
    /**
     * @param prodId Product Id passed in by the user
     * @param qty Quantity of a product passed in by the user
     * @
     * This method validates items being passed in by checking the
     * productId from the input to the database of values a Where
     * statement. Then, if the check passes, sends the value to
     * a Receipt object to add it into a ListItem
     * @see Receipt
     **/
    public void addItemToSale(String prodId, int qty) {
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        
		// if found, add the lineItem to the receipt
        if(product != null) {
            receipt.addLineItem(product, qty);
        }
        
    }
    
    /**
     * This method returns a Receipt object that contains the ItemList
     * @return The receipt created in the cash register object
     */
    public Receipt getReceipt(){
        return receipt;
    }
}
