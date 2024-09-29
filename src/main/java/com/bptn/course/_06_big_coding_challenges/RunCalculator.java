package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class RunCalculator {

	public static void main(String[] args) {
	//Declare scanner
	Scanner scanner = new Scanner(System.in);
	
	//we start the do - while loop
	
	boolean calculator = true;
	
	 do {
         // Show the calculator input menu
         System.out.println("/…Calculator Menu…/");
         System.out.println("Press 1 for addition");
         System.out.println("Press 2 for subtraction");
         System.out.println("Press 3 for multiplication");
         System.out.println("Press 4 for division");
         System.out.println("Press 5 to square a number");
         System.out.println("Press 6 to find square root");
         System.out.println("Press 7 to find reciprocal");

         // User has to make a choice in calculator menu
         System.out.print("Select number from 1-7: ");
         int number = scanner.nextInt();

         // Perform calculations based on user's choice
         if (number == 1) {
             // Addition
             System.out.print("Enter first number: ");
             double num1 = scanner.nextDouble();
             System.out.print("Enter second number: ");
             double num2 = scanner.nextDouble();
             System.out.println("The addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
         }

         if (number == 2) {
             // Subtraction
             System.out.print("Enter first number: ");
             double num1 = scanner.nextDouble();
             System.out.print("Enter second number: ");
             double num2 = scanner.nextDouble();
             System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
         }

         if (number == 3) {
             // Multiplication
             System.out.print("Enter first number: ");
             double num1 = scanner.nextDouble();
             System.out.print("Enter second number: ");
             double num2 = scanner.nextDouble();
             System.out.println("The product of " + num1 + " and " + num2 + " is: " + (num1 * num2));
         }

         if (number == 4) {
             // Division
        	 System.out.print("Enter first number: ");
             double num1 = scanner.nextDouble();
             System.out.print("Enter second number: ");
             double num2 = scanner.nextDouble();

             if (num2 == 0) {
                 System.out.println("Error: Division by zero is undefined.");
             } else {
                 System.out.println("Dividing " + num1 + " by " + num2 + "the quotient is " + (num1 / num2) + " The remainder is " + (num1 % num2));
             }
         }

         if (number == 5) {
             // Square
             System.out.print("Enter the number to find Square: ");
             double num1 = scanner.nextDouble();
             System.out.println("The square of the number " + num1 + " is: " + (num1 * num1));
         }

         if (number == 6) {
             // Square root
             System.out.print("Enter a number: ");
             double num1 = scanner.nextDouble();
             if (num1 <= 0) {
                 System.out.println("Error: Please enter a positive number.");
             } else {
                 System.out.println("The square root of " + num1 + " is: " + Math.sqrt(num1));
             }
         }

         if (number == 7) {
             // Reciprocal
             System.out.print("Enter the number to find reciprocal: ");
             double num1 = scanner.nextDouble();
             if (num1 <= 0) {
                 System.out.println("Error: Please enter a positive number.");
             } else {
                 System.out.println("The reciprocal of " + num1 + " is: " + (1 / num1));
             }
         }
         
         //WHen user makes a choice not on the list it prints out invalid choice
         if (number < 1 || number > 7) {
             System.out.println("Invalid choice. Please make a valid choice");
         }

         // Ask user to continue or exit
         System.out.print("To continue calculation, press 1. Else, press any other number to exit: ");
         int continueChoice = scanner.nextInt();
         if (continueChoice != 1) {
             calculator = false;
         }

     } while (calculator); // Check do-while condition

     // Close scanner to prevent resource leaks
     scanner.close();
	}
}

