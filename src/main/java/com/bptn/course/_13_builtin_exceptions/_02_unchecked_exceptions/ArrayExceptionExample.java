package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class ArrayExceptionExample {

	public static void main(String[] args) {
	
		int[] myArray = {10,20,30,40,50};
		//critical statement - access an index that is not found
		
		try {
			System.out.println(myArray[10]);
		}
		
	
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println("An error has occured: "+ e.getMessage());

	}
		
	}
	
}

	

