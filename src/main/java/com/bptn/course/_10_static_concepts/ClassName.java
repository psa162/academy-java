package com.bptn.course._10_static_concepts;

public class ClassName {
	
	//declare a static variable
	static int staticVariable=100;
	
	//declare an instacne variable
	int instanceVariable;
	
	//declare a static method
	static void staticMethod( ) {
		
		System.out.println("Static method is called..");
		//can I access an instance varible? NO
		
		//can I access an instance method? NO
		
	}
	
	void instanceMethod() {
		System.out.println("Instance method is called..");
		//can I access an static varible within instance method - yes
		System.out.println("Static variable: "+ staticVariable);
		
		//can i access a static methof eithin an instance method-->yes
		staticMethod();
		
	}

	public static void main(String[] args) {
		
		ClassName c1 = new ClassName();
		c1.instanceMethod();
		
		//access the static variable
		System.out.println("Static variable: "+ staticVariable);
		staticMethod();

	}

}

//Major takeaway
//1. Cannot access instance variable/methods in a static method
//2/ We can access static method/variable in an instance method
//3. We can call staic method/variable within a main method