/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author cwojciuk
 */
public class OutputConsole implements OutputStrategy{

    @Override
    public void print(Object obj) {
        System.out.println(obj);
    }
    
}
