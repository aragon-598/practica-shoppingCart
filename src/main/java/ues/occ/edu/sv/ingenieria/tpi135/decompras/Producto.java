/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.decompras;

/**
 *
 * @author aragon598
 */
public class Producto {
    
    private String code;
    private String title;
    private String descripcion;
    private double precio;
    
    public Producto(String code,String title,String descripcion, double price){
        this.code = code;
        this.title = title;
        this.descripcion = descripcion;
        this.precio = price;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return descripcion;
    }
    
    public double getPrice() {
        return precio; 
    }
    
}
