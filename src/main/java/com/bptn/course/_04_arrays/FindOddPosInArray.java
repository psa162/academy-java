package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		
		System.out.println("At odd indexes the element are: ");
		
		for (int i=1; i<numbers.length; i+=2) {
			System.out.println(numbers[i]);
		}
		
		}

	}


