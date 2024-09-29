package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class NewStringsOperation {

	public static void main(String[] args) {

		// Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Start the do-while loop
        boolean stringOperations = true;
        do {

            // Show the string operations menu
            System.out.println("/…String Operations Menu…/");
            System.out.println("Press 1 to check if a string is a palindrome");
            System.out.println("Press 2 to reverse a string");
            System.out.println("Press 3 to concatenate two strings");
            System.out.println("Press 4 to compare two strings");
            System.out.println("Press 5 to calculate the length of a string");

            // User has to make a choice in string operations menu
            System.out.print("Select number from 1-5: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    String reverseInput = "";

                    // Reverse the input
                    for (int i = input.length() - 1; i >= 0; i--) {
                        reverseInput += input.charAt(i);
                    }
                    System.out.println("Reversed input: " + reverseInput);

                    // Compare the value changing input and reverse input to lowercase
                    if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
                        System.out.println((reverseInput+input) + " is a palindrome");
                    } else {
                        System.out.println(input + " is not palindrome");
                    }
                    break;

                case 2:
                	System.out.print("Enter a string: ");
                    String str = scanner.nextLine();
                    String reverseInputTwo = "";

                    // Reverse the input
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverseInputTwo += str.charAt(i);
                    }
                    System.out.println("Reversed string: " + reverseInputTwo);
                    break;

                case 3:
                    System.out.print("Enter first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println(str1 + str2);
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = scanner.nextLine();
                    if (str1.equals(str2)) {
                        System.out.println("The entered Strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    str = scanner.nextLine();
                    System.out.println("The Length of the entered string is: " + str.length());
                    break;

                default:
                    System.out.println("Invalid choice. Please make a valid choice");
            }

            // Ask user to continue or exit
            System.out.print("To continue press 1. Else, press any other number to exit: ");
            int continueChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (continueChoice != 1) {
                stringOperations = false;
            }

        } while (stringOperations); // Check do-while condition

        // Close scanner to prevent resource leaks
        scanner.close();
    }
}