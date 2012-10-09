package cawpos;

/**
 * @author Charles Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 * Startup class contains the main method. Creates a new CashRegister object
 * adds items
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        LineItem[] li = {
            new LineItem(new Hat("A101", "Baseball Hat", 19.95, new XmasDiscount()), 5),
            new LineItem(new Shirt("B205", "Men's Dress Shirt", 35.50, new EmployeeDiscount()),7),
            new LineItem(new Ring("R432", "Diamond Ring", 499.99, new NoDiscount()),2),
            new LineItem(new Necklace("N843", "Emerald Necklace", 225.75, new JewelryDiscount()),2)
        };
        for (int i = 0; i < li.length; i++) {
            
        }
        
        cr.outputToConsole();
     }
}
