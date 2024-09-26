package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		//Declaring an array and store 6 int values inside it
				int[] myArray= {10,20,30,40,50,60};// another way to declare int[] myArray=new int[5}\]
				
				
				//the first element of the array is accessed using index=0
				
				System.out.println("The first element is: " + myArray[0]); //first array is always indexed with 0
				System.out.println("The first element is: " + myArray[1]);
				System.out.println("The first element is: " + myArray[2]);
				System.out.println("The first element is: " + myArray[3]);
				System.out.println("The first element is: " + myArray[4]); // last element is accessed using index=length-1
				
				System.out.println("The length of the array is: " + myArray.length);
				
				System.out.println("The last element is:"+ myArray[myArray.length-1]);
				
				
				//update an element at the first index to 100
				myArray[0]=100;
				System.out.println("updated first element: " + myArray[0]);
				
				//for loop to print values
				for (int i=1; i<=10; i++) {
					System.out.println(i);
				}
				
				//use for loop to print all the element of the myArray
				for (int i=0; i< myArray.length; i++) {
					System.out.println(myArray[i]);
				}
				//enhanced for-loop (for each loop)
				for (int element:myArray) {
					System.out.println(element);
				}
				//how to print the element in the myArray without for-loop
				System.out.println(Arrays.toString(myArray));
	
	}
	
	
	
	
	
}
