package com.bptn.course._07_oop;

public class Phone {
	
	//declare instance variables -properties/attributes
	//weight, height, width, color
	
	private int weight;
	private int height;
	private int width;
	private String color;
	
	//Constructor
	//Has the same name as the class
	//Does not have any return type
	//Default constructor - dont not have any parameters passed
	public Phone() {
		//default values
		weight = 150;
		height = 140;
		width = 70;
		color ="Black";
	}
	//Parameterized constructor - which has parameters passed
	public Phone(int w, int h, int wi, String c) {
		weight = w;
		height = h;
		width = wi;
		color =c;
	}
	
	//2nd Parameterized constructor - 3 parameters passed
	public Phone(int w, int h, int wi) {
		weight = w;
		height = h;
		width = wi;
	}
	
	
	// declare-instance methods-behaviour/functionality 
	public void makePhoneCall() {
		System.out.println("Make a phone call");
	}
	
	public void sendTextMessage()  {
		System.out.println("send text message");
	}
	

	public static void main(String[] args) {
		//Create an object if the Phone class using default constuctor
		Phone myObj1 = new Phone();
		System.out.println("default phone: " + "Width: " + myObj1.width + " height: " +myObj1.height+ " weight: "+ myObj1.weight + " color: "+myObj1.color);
		Phone myObj2 = new Phone(200,100,50,"Red");
		System.out.println("Custom phone: " + "Width: " + myObj2.width + " height: " +myObj2.height+ " weight: "+ myObj2.weight + " color: "+myObj2.color);
		Phone myObj3 = new Phone(200,100,50);	
		System.out.println("Custom phone: " + "Width: " + myObj3.width + " height: " +myObj3.height+ " weight: "+ myObj3.weight);
 	    myObj1.makePhoneCall(); //accessing the instance method 
 	    myObj1.sendTextMessage();
	
	}
	
	


}

//instance variable are always declared as private because we want to encapsulate this from being accessed from another class

//instance method are declared as public because we want it to be accessible