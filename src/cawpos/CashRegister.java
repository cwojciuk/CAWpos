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
        new Shirt("B205", "Men's Dress Shirt", 35.50, new EmployeeDiscount()),
        new Socks("C222", "Women's Socks", 9.50, new NoDiscount()),
        new Ring("R432", "Diamond Ring", 499.99, new NoDiscount()),
        new Shoes("S934", "Nike Free Run 2.0", 89.99, new XmasDiscount()),
        new Necklace("N843", "Emerald Necklace", 225.75, new JewelryDiscount())
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
    
    public Receipt getReceipt(){
        return receipt;
    }
}
