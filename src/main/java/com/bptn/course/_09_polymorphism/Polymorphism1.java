package com.bptn.course._09_polymorphism;

//parent class
	class Animal {
		
		void makeSound() {
			System.out.println("Animal makes a sound");
		}
		
	}
	//Sub-class with extends
	
	class Dog extends Animal{
		//has its own methods
		
		@Override
		 void makeSound() {
			 System.out.println("Dog barks");
			
			
		}
		
	}

public class Polymorphism1 {
	

	public static void main(String[] args) {
		//create an object of the Animal class
		Animal a1= new Animal();
		a1.makeSound();
		
		//create an object from Dog class
		Dog d1= new Dog();
		d1.makeSound();	

	}

}
//Major Key takeaways
//Method overriding
//1.Scenerio- when the subclass decides to override an existing method in the parent class
//2. Name of the method,return type of the method and number of parameters in the overriden method should be the same
//3. By convention, the overriden method has @Override annotation above its method signature
//4. Static method cannot be overriden