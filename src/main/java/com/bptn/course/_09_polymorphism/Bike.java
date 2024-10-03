package com.bptn.course._09_polymorphism;

public class Bike extends Vehicle {

	
		//Step 3a: Declare String bikeHandle 
		private String bikeHandle;

	    //Step 3b: Define parameterized constructor for color, brand, bikeHandle
		public Bike(String color, String brand, String bikeHandle) {
			
			super(color, brand);//this calls the constructor from the Vehicle class(parent class)
			this.bikeHandle= bikeHandle;
		}

	    //Step 3c: Create a print() method as per the specification in the above
//		public void print() {
//			super.print();// this calls the print() method from the Vehicle class(parent class)
//		}
		
		@Override
	public void print() {
	    System.out.println("I am Bike");
	
	}

}
