package com.bptn.course._22_generics;

public class GenericsDemo {
	//find maximum  between two numbers
	public static int findMax(int num1, int num2) {
		return (num1> num2) ? num1: num2;
	}

	public static void main(String[]args) {
		
		System.out.println("Max of 10 and 20: " +findMax(10,20));
	}
}
