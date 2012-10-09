package cawpos;
import javax.swing.*;
/**
 * @author Chuck Wojciuk
 * Advanced Java Programming 152-135-10442-13
 * Point of Sales Lab
 * 10/9/2012
 */
public class OutputUI implements OutputStrategy{

    /**
     *
     * @param obj
     */
    @Override
    public void print(Object obj) {
        JOptionPane.showMessageDialog(null, obj);   
    }
    
}
