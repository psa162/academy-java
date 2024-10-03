package com.bptn.course_10_abstraction.copy;


//Abstraction using abstract class
	
//Abstract class - its a class that cannot be used to create object i.e instantiated

abstract class Shape {
	//Abstract method---> a method which has no implementation
	abstract void draw();
	abstract void print();
	//normal methods- which has an implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: "+ x+ y);
		
	}
}

//Sub class(child class) extends Shape class
class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a circle");
		
	}

	@Override
	void print() {
		System.out.println("Print a circle");
		
	}
}
	class Rectangle extends Shape {

		@Override
			void draw() {
				System.out.println("Draw a rectangle");
			
		}

		@Override
		void print() {
			System.out.println("Print a rectangle");
			
		}
	
}


public class Abstraction1 {
	public static void main(String[] args) {
		//create object from circle class
		Circle c1= new Circle();
		c1.draw();
		c1.print();
		c1.moveTo(2,3);// this is an inherited method from shape class
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print();
		r1.moveTo(2, 3);
	

	}
	
}




//when a subclass implements the abstract methods from the abstract class it should follow the rules of overriding 
