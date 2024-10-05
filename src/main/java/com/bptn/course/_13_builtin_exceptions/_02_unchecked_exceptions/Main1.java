package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class Main1 {
	
	void method() {
		//outer try-catch block
		try {
			//inner try catch
			
		try {
			int[]arr= {1,2,3,4};
			
			System.out.println(arr[0]);//this will not fail
			System.out.println(arr[5]);//critical statement
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured");
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
	}

	// main() method to run the program
    public static void main(String args[]) {
        Main1 nestedTryBlockSolutionObject = new Main1();
        nestedTryBlockSolutionObject.method();
    }
}
