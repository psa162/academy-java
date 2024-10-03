package com.bptn.course._09_polymorphism;
	
	// Parent class (Shape)
	class Shape {
		
		void drawAngle() {
			System.out.println("Drawing a shape angle");
		}
	}

	// Subclass (Rectangle)
	class Rectangle extends Shape {
		@Override 
		void drawAngle() {
			System.out.println("Drawing a rectangle");
		}
	}

	public class Polymorphism2 {

		public static void main(String[] args) {
			
			Shape r1 = new Shape();
			r1.drawAngle();
			
			Rectangle r2 = new Rectangle(); // Missing parentheses
			r2.drawAngle();

			// Demonstrating polymorphism
			Shape r3 = new Rectangle(); // Parent reference, child object
			r3.drawAngle();
		}
	}


//create parent class
//create one sub class called Rectangle