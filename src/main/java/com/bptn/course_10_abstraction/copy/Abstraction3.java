package com.bptn.course_10_abstraction.copy;


//Abstraction using interface (After Java 8)
//Interfaces can support abstract methods, default methods and static methods

interface Operations{
	
	void draw();// abstract method- it has no implementation
	
	//default method- has some implementation
	default int add(int a, int b) {
		return a+b;
		
	}
	
	//static method
	static double getRandomNumber() {
		return Math.random();	}
}

//sub class- create a sub class that implements the Operations interface
class Calculator implements Operations {
	// compiler always enforces the subclass to implement or over ride the methods in the abstract methods from the interface
	@Override
	public void draw() {
		System.out.println("Draw method implemented by Calculator class");
		
	}
	
	
}
public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2,4);
		System.out.println("The result is: "+ result);
		System.out.println("The random number is: "+ Operations.getRandomNumber());

	}

}
//Interface cannot be instantiated
//abstract method in the interface is implemented using a subclass
//interface support multiple inheritance
//inteface cannot have constructor