/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplicationclass_st10114043;

/**
 *
 * @author majol
 */
public abstract class Console implements IConsole {
    
    // Declare fields for abstract class 
    
    private String consoleType;
    private String store;
    private int totalSales;
    
    // Constructor to set values up for object 
    public Console(String consoleType, String store, int totalSales){
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }
    
     // Getters
    public String getConsoleType() {
        return consoleType;
        
    }
    
    public String getStore() {
        return store;
    }
    
    public int getTotalSales() {
        return totalSales;
    }
    
    
}
