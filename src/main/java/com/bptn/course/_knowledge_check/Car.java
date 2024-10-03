package com.bptn.course._knowledge_check;

public class Car extends Vehicle {

		   //instance variable 
		   String steeringWheel;

		   //add parameterized constructor- use super keyword to call parent constructor
		    Car(String colour, String brand, String steeringWheel) {
		        super(colour, brand); // Calls Vehicle constructor
		        this.steeringWheel = steeringWheel;

		}

}


