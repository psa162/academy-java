package com.bptn.course._knowledge_check;

public class Vehicle {

	//declare instance variables- colour and brand
	private String colour;
	private String brand;

    Vehicle() {
        this("Black", "Tesla");
    }

    // add parameterized constructor 
    Vehicle(String colour, String brand){
    	this.colour=colour;
    	this.brand=brand;
    }
    
    public String getColour() {
    	return colour;
    }
    
    public String getBrand() {
    	return brand;
    }
    
    //Do not modify this code as we have parameters that pass the test case
    public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        System.out.println(car.getColour() + " " + car.getBrand() + " " + car.steeringWheel);
        System.out.println(bike.getColour() + " " + bike.getBrand() + " " + bike.bikeHandle);

    }

}
		

	


