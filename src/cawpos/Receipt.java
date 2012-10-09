package cawpos;

/**
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 */
public class Receipt {
   PrintReceipt pr;
   private LineItem[] lineItems = new LineItem[0];
    
   public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    public double getTotalAfterDiscount() {
        double discountedGrandTotal = 0.0;
        for(LineItem item : lineItems) {
            discountedGrandTotal += item.getDiscPriceTotal();
        }
        return discountedGrandTotal;
    }
    public LineItem[] getLineItems(){
        return lineItems;
    }
    
}
