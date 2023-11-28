package org.example;

import java.util.Scanner;

import math.com.MathLibraryImpl;

public class Main {
    public static void main(String[] args) {
        MathLibraryImpl math = new MathLibraryImpl(); 
        
        Scanner sc = new Scanner(System.in); 
        
        String choice = "continue";
        
        do {
        	System.out.println("Enter operation type [add, subtract, multiply, divide, or exit]");
            choice = sc.nextLine();  
            
        switch(choice) {
        case "add": 
        	System.out.println("Enter the first number you would like to add."); 
        	int addend1 = sc.nextInt(); 

        	System.out.println("Enter the second number you would like to add."); 
        	int addend2 = sc.nextInt(); 

        	System.out.println(addend1+" + "+addend2+" = "+math.add(addend1, addend2)); 
        	break; 
        
        case "subtract": 
        	System.out.println("Enter the number you would like to subtract from."); 
        	int minuend = sc.nextInt(); 
        	System.out.println("Enter the number you would like to subtract from the first number."); 
        	int subtrahend = sc.nextInt(); 
        	
        	System.out.println(minuend+" - "+subtrahend+" = "+math.subtract(minuend, subtrahend)); 
        	break; 
        
        case "multiply": 
        	System.out.println("Enter the number you would like to multiply."); 
        	int multiplicand = sc.nextInt(); 
        	System.out.println("Enter the number you would like to multiply by."); 
        	int multiplier = sc.nextInt(); 
        	
        	System.out.println(multiplicand+" * "+multiplier+" = "+math.multiply(multiplicand, multiplier)); 
        	break; 
        
        case "divide": 
        	System.out.println("Enter the number you would like to divide."); 
        	int dividend = sc.nextInt(); 
        	System.out.println("Enter the number you would like to divide it by."); 
        	int divisor = sc.nextInt(); 
        	
        	System.out.println(dividend+" / "+divisor+" = "+math.divide(dividend, divisor)); 
        	break; 
        case "exit":
        	System.out.println("Exiting... see you next time."); 
        	break;
        default: 
        	System.out.println("\""+choice+"\" is not a valid choice. Please enter another." );
        	break; 
        }
        sc.nextLine();
        } while (!choice.equalsIgnoreCase("exit"));

    }
}