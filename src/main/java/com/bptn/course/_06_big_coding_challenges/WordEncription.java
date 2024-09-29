package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class WordEncription {

	public static void main(String[] args) {
		
	//Declare scanner	
		Scanner scanner = new Scanner(System.in);

		//Ask user to input a word
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        String encryptedWord = "";

        //Introduce a for loop 
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == 'z') {
                encryptedWord += 'a';
            } else if (c == 'Z') {
                encryptedWord += 'A';
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                encryptedWord += (char) (c + 1);
            } else {
                encryptedWord += c;
            }
        }

        System.out.println("Encrypted word: " + encryptedWord);

        scanner.close();
    }
}
