/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplicationclass_st10114043;

/**
 *
 * @author majol
 */
public class ConsoleSales extends Console {
    
    // Subclass extending abstract class to print everything in it 
    
     // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
    
    //Print Report Method 
    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTALSALES: " + getTotalSales());
    
  
    
    
}

    @Override
    public String getConsoletype() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
