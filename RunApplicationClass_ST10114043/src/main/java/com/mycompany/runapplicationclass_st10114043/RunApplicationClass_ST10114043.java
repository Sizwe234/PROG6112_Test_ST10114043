/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplicationclass_st10114043;

import java.util.Scanner;

/**
 *
 * @author majol
 */
public class RunApplicationClass_ST10114043 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
      // Printing Console Types 
        System.out.println("Select the Console Type: ");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        String consoleType = input.nextLine();
        
        System.out.println(" ");
        
        System.out.println("1");
        
        System.out.println("Enter the store: ");
        String store = input.nextLine();
        
        System.out.println("Enter the total sales of PS5 consoles for " + store + ":");
        int totalSales = input.nextInt();
        
        
        
        
        
        //Create Object
        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);
        
        // Print Report
        salesReport.printReport();
    }
}
