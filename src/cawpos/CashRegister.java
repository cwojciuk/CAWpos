/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cawpos;

/**
 *
 * @author Ninja
 */
public class CashRegister {
    Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new XmasDiscount()),
        new Product("B205", "Men's Dress Shirt", 35.50, new XmasDiscount()),
        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
    };
}
