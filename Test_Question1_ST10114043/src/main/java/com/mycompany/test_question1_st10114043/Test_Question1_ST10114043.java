/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_question1_st10114043;

/**
 *
 * @author majol
 */
public class Test_Question1_ST10114043 {

    public static void main(String[] args) {
       // Declarations of 2-D Array
       int [][]sales = {
           {1000, 2000, 3000},
           {2000, 3000, 4000},
           {1500, 1100,1200}
       };
       
       // Declaring Array for the City Names 
        String[] cities = {"Cape Town", "Johannesburg", "Port elizabeth"};
        
        // Printing Report Heading 
        
        System.out.println("----------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------");
        
                for (int city  = 0; city  < sales.length; city ++) { // Looping through cities of sales array 
                    System.out.println(cities[city] + ":");
                    for (int consoleType = 0; consoleType < sales[city].length; consoleType++) { // Looping through console types of sales array 
                                    System.out.print(sales[city][consoleType] + " ");  // printing our cities and sales of console types 
                                    
    
                    }
                    
                     System.out.println(); // New line for new list of sales for each city
                }
                
              
                
                  // Making variable to loop throug array to find max 
        int maxTotal = 0;
        String maxCity = "";  // initialize city variable with max sales for the sake of printing 
        
        // loop through accidents again for the sake of calculating totals
        for (int city = 0; city < sales.length; city++) {
            int total = 0; // making total 0 so we can start from 0 and add all up 
            for (int consoleType = 0; consoleType < sales[city].length; consoleType++) {
                total += sales[city][consoleType]; // Adding the console type sales together

    }
             // Printing the totals for cities 
             
              System.out.println();
                
            System.out.println("----------------------------------------");
            System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
            System.out.println("---------------------------------------");
            System.out.println();
            System.out.println(cities[city] + " Total: " + total);
            
            if (total > maxTotal) {  // If the total is greater than the current total , then that one will become the max total 
                maxTotal = total;
                maxCity = cities[city]; // go through all cities to find biggest total                 
            }
            
        }
        
        // Printing City with most totals 
        System.out.println("City with most sales: " + maxCity);
}
}
