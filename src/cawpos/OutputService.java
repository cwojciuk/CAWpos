/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author cwojciuk
 */
public abstract class OutputService {
    private OutputStrategy printerStrategy;
    
    public OutputService(OutputStrategy printerStrategy){
        this.printerStrategy = printerStrategy;
    }
    public abstract void print();
}
