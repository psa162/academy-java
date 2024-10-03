package com.bptn.course._09_polymorphism;

public class Polymorphism3 {
	
	void print (int integer) {
		System.out.println("printing an integer: "+ integer);
	
	}
	
	void print (String s) {
		System.out.println("printing a string: "+ s);
	}

	int print (int a, int b) {
		return a+b;
	}
	
	double print (double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
		p1.print("hello world");
		
		System.out.println("The sum of two integers: "+ p1.print(2,3));
		System.out.println("The sum of two doubles: "+ p1.print(2,3));
		

	}

}
//Major takeaway
//1. it occurs with the same class and no inheritance is required