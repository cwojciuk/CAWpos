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
    Product[] products = {
        new Hat("A101", "Baseball Hat", 19.95, new XmasDiscount()),
        new Shirt("B205", "Men's Dress Shirt", 35.50, new XmasDiscount()),
        new Socks("C222", "Women's Socks", 9.50, new NoDiscount())
    };
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
}
