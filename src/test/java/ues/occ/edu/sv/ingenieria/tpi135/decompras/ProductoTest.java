/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.decompras;


import junit.framework.TestCase;

/**
 *
 * @author aragon598
 */
public class ProductoTest extends TestCase{
    
    private Producto prod1;
    
    public ProductoTest(String testName) {
        super(testName);
    }

    @Override
    public  void setUp() throws Exception {
        prod1 = new Producto("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen",699.99);
    }

    @Override
    public void tearDown() throws Exception {
        prod1 = null;
    }
    

    /**
     * Test of getCode method, of class Producto.
     */
    @org.junit.Test
    public void testGetCode() {
        String expResult = "P001";
        String result = prod1.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Producto.
     */
    @org.junit.Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Plasma TV LG 32";
        String result = prod1.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Producto.
     */
    @org.junit.Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Plasma TV with TDT Decod. and high resolution Screen";
        String result = prod1.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Producto.
     */
    @org.junit.Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 699.99;
        double result = prod1.getPrice();
        assertEquals(expResult, result);
    }
    
}
