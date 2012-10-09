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
    public void Print(Receipt receipt, OutputStrategy outputStrategy){
        LineItem[] lineItems;
        lineItems = receipt.getLineItems();
        String outputString = "";
        
        for(int i = 0;i < lineItems.length;i++){
            outputString += (lineItems[i].getItemProd().getProdId()
                    + "\t" + lineItems[i].getItemProd().getDescription()
                    + "\n    \t" + String.format("$%.2f",lineItems[i].getItemProd().getPrice())
                    + " x " + lineItems[i].getQuantity()
                    + "\n    \t" + 
                    (String.format("$%.2f",lineItems[i].getItemProd().getPrice()*lineItems[i].getQuantity()))
                    + "\n    \t(" + String.format("$%.2f", lineItems[i].getItemProd().getDiscountStrategy().getDiscountInDollars(
                    lineItems[i].getItemProd().getPrice())*lineItems[i].getQuantity()) + ")\n");
        }
        outputString += ("Total Before Discount:\t" + String.format("$%.2f",receipt.getTotalBeforeDiscount()));
        outputString += ("Total After Discount:\t" + String.format("$%.2f", receipt.getTotalAfterDiscount()));
        outputString += ("Total Saved:\t\t" + String.format("$%.2f", receipt.getTotalBeforeDiscount()-receipt.getTotalAfterDiscount()));
        outputStrategy.print(outputString);
    }
}
