package cawpos;
import javax.swing.*;
/**
 *
 * @author cwojciuk
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
