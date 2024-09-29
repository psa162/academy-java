package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		 // We are setting the number to guess at 23
        int targetNumber = 23;

        // Declare Scanner 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100:");
     
        // Get user's guess
        int guess = scanner.nextInt();
        
        if (guess< 1 || guess >100) {
            System.out.println("Please enter a number between 1 and 100.");
        } else {

        // Check guess with the else if statement 
        if (guess < targetNumber) {
            System.out.println("Too low! Try again");
        } else if (guess > targetNumber) {
            System.out.println("Too high! Try again");
        
        } else  {
            System.out.println("Congratulations! You guessed the number correctly!");
        }

        scanner.close();
        }
	}

}
