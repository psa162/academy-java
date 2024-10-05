package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NestedTryExamples {

	public static void main(String[] args) {
		
		//outer try catch block
		
		try {
			int []nums= {1,2,3,4};
			int divisor =0;
			String text =null;
			
			//inner try -catch block 1
			try {
				int result = 10/0; //critical statement
				System.out.println("The result is: "+ result);
			}
			catch(ArithmeticException e) {
				System.out.println("An arithmetc exception occured: "+e.getMessage());
			}
				//inner try-catch block 2
			try {
				System.out.println("The length of string is : "+ text.length());//critical statement
			
			}
				catch(NullPointerException e) {
					System.out.println("The nullpointer occured: "+ e.getMessage());
				}
			
			//inner try block 3
			try {
				System.out.println(nums[4]);//critical statement
			}
		    catch(ArrayIndexOutOfBoundsException e) {
		    	System.out.println("The ArrayIndexOutOfBounds Exception occured: " +e.getMessage());
		    }
		}
		
		
		catch (Exception e) {
			System.out.println("a general exception occured: "+ e.getMessage());
		}
		System.out.println();
		

	}

}
