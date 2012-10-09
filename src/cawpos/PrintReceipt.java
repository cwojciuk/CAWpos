/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class PrintReceipt {
    public void Print(Receipt receipt){
        LineItem[] lineItems;
        lineItems = receipt.getLineItems();
        
        for(int i = 0;i < lineItems.length;i++){
            System.out.println(lineItems[i].getItemProd().getProdId()
                    + "\t" + lineItems[i].getItemProd().getDescription()
                    + "\n    \t" + String.format("$%.2f",lineItems[i].getItemProd().getPrice())
                    + " x " + lineItems[i].getQuantity()
                    + "\n    \t" + 
                    (String.format("$%.2f",lineItems[i].getItemProd().getPrice()*lineItems[i].getQuantity()))
                    + "\n    \t(" + String.format("$%.2f", lineItems[i].getItemProd().getDiscountStrategy().getDiscountInDollars(
                    lineItems[i].getItemProd().getPrice())*lineItems[i].getQuantity()) + ")\n");
        }
        System.out.println("Total Before Discount:\t" + String.format("$%.2f",receipt.getTotalBeforeDiscount()));
        System.out.println("Total After Discount:\t" + String.format("$%.2f", receipt.getTotalAfterDiscount()));
        System.out.println("Total Saved:\t\t" + String.format("$%.2f", receipt.getTotalBeforeDiscount()-receipt.getTotalAfterDiscount()));
    }
}
