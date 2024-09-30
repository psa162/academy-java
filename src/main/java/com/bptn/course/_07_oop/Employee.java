package com.bptn.course._07_oop;

public class Employee {
	
	//Instance variable
	//name, employeeId and age
	
	private String name;
	private int employeeid;
	private int age;
	
	
	//Constructors
	//default contructor
	public Employee () {
		name = "Samuel";
		employeeid =100;
		age= 32;
	}
	
	
	//Parameterized constructor - with 2 parameters
	public Employee (String name, int employeeid) {
		this.name= name;
		this.employeeid=employeeid;
	}
	//Parameterized constructor - 3 parameters
	public Employee (String name, int employeeid, int age) {
		this(name, employeeid); //this is trying to call the constructor employee (String name, int employeeid)- with 2 parameters
		this.age =age;
		
	}
	//methods
	public void printInfo( ) {
			System.out.println("Employee name: "+ this.name + " Employeeid: "+ this.employeeid + "age: "+ this.age);
	}

	public static void main(String[] args) {
		//create objects from this class
		Employee e1 = new Employee();
		e1.printInfo();
		
		Employee e2 = new Employee("John Doe", 1234);
				e2.printInfo();
		
		Employee e3 = new Employee ("sam amoo", 1233, 45);
		e3.printInfo();
	}

}
