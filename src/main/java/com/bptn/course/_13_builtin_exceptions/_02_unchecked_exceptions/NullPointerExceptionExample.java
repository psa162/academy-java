package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		String text =null;
		
		try {
			System.out.println("Length of string is: "+ text.length());
		}
		catch(NullPointerException e) {
			System.out.println("An error as occured"+ e.getMessage());
		}
	}

}
