package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// critical example
		try {
		int result =10/0;
		
		System.out.println(result);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Error occured: "+ e.getMessage());
			
		}
	}

}
