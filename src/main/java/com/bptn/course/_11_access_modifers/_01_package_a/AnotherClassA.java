package com.bptn.course._11_access_modifers._01_package_a;


public class AnotherClassA {

	public static void main(String[] args) {

		// create an object of ClassA
		ClassA myObj = new ClassA();

		// No we cannot access the private method outside the class
		// myObj.privateMethod();

		// No we cannot access the private variable outside the class
		// System.out.println("Accessing private variable: " + myObj.privateVar);

		// Yes we can access the default method outside the class but in the same
		// package
		myObj.defaultMethod();

		// Yes we can access the default variable outside the class but in the same
		// package
		System.out.println("Accessing default variable: " + myObj.defaultVar);

		// Yes we can access the public method outside the class but in the same package
		myObj.publicMethod();

		// Yes we can access the public variable outside the class but in the same
		// package
		System.out.println("Accessing public variable: " + myObj.publicVar);
		
		//Yes we can access the protected method outside the class but in the same package
		myObj.protectedMethod();
		
		//Yes we can access the protected variable outside the class but in the same package
		System.out.println("Accessing protected variable: " + myObj.protectedVar);
	}

}


//Major keytakeaways
//1. We cannot access the private variable and method  outside the class but in the same package
//2. We can access default variable and method  outside the class but in the same package
//3. We can access public variable and method outside the class but in the same package
//4. We can access protected variable and method  outside the class but in the same package
