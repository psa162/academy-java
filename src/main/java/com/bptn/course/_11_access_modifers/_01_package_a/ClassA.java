package com.bptn.course._11_access_modifers._01_package_a;


public class ClassA {

	// declare a private variable
	private int privateVar;

	// declare a public variable
	public int publicVar;

	// declare a default variable
	int defaultVar;

	// declare a protected variable
	protected int protectedVar;

	// declare a private method
	private void privateMethod() {

		System.out.println("This is a private method");
	}

	// declare a public method
	public void publicMethod() {
		System.out.println("This is a public method");
	}

	// declare a default method
	void defaultMethod() {
		System.out.println("This is a default method");
	}

	// declare a protected method
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}

	public static void main(String[] args) {
		
		//create an object of ClassA
		ClassA myObj= new ClassA();
		
		//Yes we can access the private method within the same class
		myObj.privateMethod();
		
		//Yes we can access the private variable within the same class
		System.out.println("Accessing private variable: "+ myObj.privateVar);
		
		//Yes we can access the default method within the same class
		myObj.defaultMethod();
		
		//Yes we can access the default variable within the same class
		System.out.println("Accessing default variable: " + myObj.defaultVar);
		
		//Yes we can access the protected method within the same class
		myObj.protectedMethod();
		
		//Yes we can access the protected variable within the same class
		System.out.println("Accessing protected variable: " + myObj.protectedVar);
		
		
		//Yes we can access the public method within the same class
		myObj.publicMethod();
		
		//Yes we can access the public variable within the same class
		System.out.println("Accessing public variable: " + myObj.publicVar);
		

	}

}

//Major keytakeaways
//1. We can access the private variable and method within the same class
//2. We can access default variable and method within the same class
//3.We can access public variable and method within the same class
//4.We can access protected variable and method within the same class
