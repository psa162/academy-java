package com.bptn.course._12_wrapper_class;

public class Main {

	public static void main(String[] args) {
		// Autoboxing = converting a primitive type into Wrapper class int --> Integer
		Integer intObject = Integer.valueOf(100);
		
		//Alternatively, we can also convert primitive type to Wrapper class using below syntax
		Integer intObject1=20;
		
		//Unboxing
		int intPrimitive = intObject;//more preferred because it short and concise
		
		//Alternatively
		int intPrimitive1 =intObject1.intValue();

	}

}
//Autoboxing means converting a primitive type into wrapper class e.g int---> Integer
//Unboxing means converting a wrapper class into a primitive class e.g Integer ---> int
//Practical application of java class is its used in Java collections and java generics