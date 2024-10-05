package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {

		try {
		callMethod();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured: "+ e.getMessage());
		}

	}

	public static void readFile(String fileName) throws FileNotFoundException {

		// create an object of FileReader

		FileReader fileReader = new FileReader(fileName);
	}
	public static void callMethod() throws FileNotFoundException {
	
	  readFile("Result.txt");
}
}
//FileNotFoundException is a checked exception where the java compiler wants you to deal with it
//when we call a method which has a checked exception in the method signature 
//java compiler gives you two options
//1st option - to surround it with a try/catch
//2nd option - add it again in the throws of the method signature 