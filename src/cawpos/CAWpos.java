/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class CAWpos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        PrintReceipt pr = new PrintReceipt();
        
        cr.addItemToSale("A101", 5);
        cr.addItemToSale("B205", 12);
        cr.addItemToSale("C222", 8);
        cr.addItemToSale("R432",5);
        cr.addItemToSale("S934", 12);
        
        pr.Print(cr.getReceipt());
    }
}
