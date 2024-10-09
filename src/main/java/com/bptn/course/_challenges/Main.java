package com.bptn.course._challenges;


import java.util.*;

	public class Main {
	    public static void main(String[] args) {

	        // Create a bunch of student objects 
	        Student student1 = new Student(123, "testUsername1", "password", "John", "Doe", "john@example.com", "1234567890", "123 Main St", "Male", new Date(2000, 1, 1), new Date(2020, 1, 1), 1234, "Computer Science");
	        Student student2 = new Student(456, "testUsername2", "password", "Jane", "Doe", "jane@example.com", "9876543210", "456 Elm St", "Female", new Date(2001, 1, 1), new Date(2021, 1, 1), 5678, "Mathematics");
	        Student student3 = new Student(789, "testUsername3", "password", "Bob", "Smith", "bob@example.com", "5555555555", "789 Oak St", "Male", new Date(2002, 1, 1), new Date(2022, 1, 1), 9012, "Engineering");

	        // Create instance of university called "university" and populate it with the students.
	        University university = new University();
	        university.addStudent(student1);
	        university.addStudent(student2);
	        university.addStudent(student3);

	        System.out.println("\nUniversity ------ \n" + university);
	        System.out.println("\nGetting student------\n" + university.getStudent(123));
	        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
	        System.out.println("\nSearching student------\n" + university.searchStudent("testUserna"));

	        System.out.println("\nUniversity ------ \n" + university);
	    }
	}
