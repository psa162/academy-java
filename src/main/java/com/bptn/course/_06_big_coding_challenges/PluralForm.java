package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		//Declare scanner
		Scanner scanner = new Scanner(System.in);
		//Ask user to input # and word
        System.out.print("# in: ");
        int amt = scanner.nextInt();
        System.out.print("word: ");
        String word = scanner.next();

        // Print plural form using if else statement
        if (amt == 1) {
            System.out.println(amt + " " + word);
        } else {
            // print plural form with various conditions
            if (word.endsWith("fe")) {
                System.out.println(amt + " " + word.substring(0, word.length() - 2) + "ves");
            } else if (word.endsWith("y") && 
                       !word.endsWith("ay") && 
                       !word.endsWith("oy") && 
                       !word.endsWith("ey") && 
                       !word.endsWith("uy")) {
                System.out.println(amt + " " + word.substring(0, word.length() - 1) + "ies");
            } else if (word.endsWith("sh") || word.endsWith("ch")) {
                System.out.println(amt + " " + word + "es");
            } else if (word.endsWith("us")) {
                System.out.println(amt + " " + word.substring(0, word.length() - 2) + "i");
            } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                System.out.println(amt + " " + word + "s");
            } else {
                System.out.println(amt + " " + word + "s"); // default
            }
        }

        	//close scanner
	        scanner.close();

	}

}
