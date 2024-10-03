package com.bptn.course._09_polymorphism;

public class Car extends Vehicle {

	//Step 2a: Declare String steeringWheel 
		private String steeringWheel;

	    //Step 2b: Define a parameterized constructor as per the specifications above
		public Car(String color, String brand, String steeringWheel) {
			
			super(color, brand); //this calls the constructor from the Vehicle class(parent class)
			this.steeringWheel= steeringWheel;
		}

	    //Step 2c: Create a print() method as per the specifications above
//		public void print() {
//			super.print();// this calls the print() method from the Vehicle class(parent class)
//		}
		
		@Override
	public void print() {
	    System.out.println("I am Car");
		
		

	}

}
