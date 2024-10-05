package com.bptn.course._Teach_back;

	public class Student {
	    // Non-static variables (student information)
	    private String name;
	    private int age;
	    private int id;

	    // Static variables (academy information)
	    public static String instructor;
	    public static String academy;
	    public static int totalStudents;

	    public Student(String name, int age, int id) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	        totalStudents++; // Increment total students
	    }

	    // Static method to print academy information
	    public static void printAcademyInfo() {
	        System.out.println("Instructor: " + instructor);
	        System.out.println("Academy Name: " + academy);
	        System.out.println("Total Students: " + totalStudents);
	    }
	        
	    public static void main(String[] args) {
	        // Set academy information (static variables)
	        Student.instructor = "Ms. Sweytha";
	        Student.academy = "Obsidi";

	        // Create students (instances)
	        Student jessica = new Student("Jessica", 20, 1);
	        Student lara = new Student("Lara", 23, 2);
	        Student	Samuel = new Student("Samuel", 25,3);
	      


	        // Print student information
	        System.out.println("Name: " + jessica.name);
	        System.out.println("Age: " + jessica.age);
	        System.out.println("ID: " + jessica.id);

	     // Print academy information using static method
	        System.out.println("Academy Information:");
	        Student.printAcademyInfo();
	    }
	}
