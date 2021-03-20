/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.decompras;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aragon598
 */
public class ShoopingCart {
    
    private ArrayList items;
    
    public ShoopingCart() {
        items = new ArrayList();
    }
    
    public double getBalance() {
        double balance = 0.00;
        for (Iterator i = items.iterator(); i.hasNext();) {
            Producto item = (Producto)i.next();
            balance += item.getPrice();         
        }
        
        return balance;
    }
    
    public void addItem(Producto item) {
        items.add(item);
    }
    
    public void removeItem(Producto item) {
        items.remove(item);
    }
    
    public int getItemCount() {
        return items.size();
    }
    
    public void empty() {
        items.clear();
    }
}