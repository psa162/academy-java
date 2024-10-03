package com.bptn.course._08_week2_instructor_led_examples;

public class Car {

    
	// Declare private fields
    private String color;
    private String brand;
    private int price;

    // Parameterized constructor
    public Car(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
    
    // Default constructor
  //Declare parameterized constructor
    public Car() {
        this.color = "red";
        this.brand = "Toyota";
        this.price= 80000;  //Call parameterized constructor
    }

    // Public method to print car details
    public void printCarDetails() {
        print(); // Call private print method
    }

    // Private method to format output
    private void print() {
        System.out.println("Car{color='" + color + "', brand='" + brand + "', price=" + price + "}");
    }
}

