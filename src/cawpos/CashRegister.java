package cawpos;

/** 
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 */
public class CashRegister {
    Receipt receipt = new Receipt();

    
    ///////////////////////////////////////////////////////////////////
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
    ///////////////////////////////////////////////////////////////////
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
   
    ///////////////////////////////////////////////////////////////////
    /**
     * This method returns a Receipt object that contains the ItemList
     * @return The receipt created in the cash register object
     */
    ///////////////////////////////////////////////////////////////////
    public Receipt getReceipt(){
        return receipt;
    }
    /**
     * Makes a call to 
     */
    public final void outputToConsole(){
        pr.Print(getReceipt(),new OutputConsole());
    }
    public final createNewReceipt(){
        
    }
}
