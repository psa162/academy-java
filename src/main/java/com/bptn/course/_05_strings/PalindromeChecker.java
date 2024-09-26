package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		

		        //Promt user to enter a string to check for palindrome
		        System.out.println("Enter the string to check for palindrome: ");
		       
		       //Declare scanner object
		        Scanner scanner = new Scanner(System.in);

		        //Declare a variable
		        String input = scanner.nextLine();

		        //Declare a varibale to store the reverseInput
		        String reverseInput = "";
		        
		       
		        
		        
		        //reverse the input 
		        for (int i = input.length() - 1; i >= 0; i--) {
		            reverseInput += input.charAt(i);
		           
		        }
		        System.out.println("reverse input: "+reverseInput);
		        
		        //compare the value changing input and reverseinput to lowercase
		        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
		            
		            //if same print 
		            System.out.println("Input string is palindrome");
		        } else {

		            //if different print
		            System.out.println("Input string is not palindrome");
		        }//close the scanner
		          scanner.close();
		    }

	}

