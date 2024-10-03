package com.bptn.course._08_week2_instructor_led_examples;

public class Main {

    public static void main(String[] args) {
        Car defaultCar = new Car();
        defaultCar.printCarDetails();

        // Create another car with custom values
        Car customCar = new Car("Blue", "Honda", 60000);
        customCar.printCarDetails();
    }
}