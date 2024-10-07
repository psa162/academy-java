package com.bptn.course._knowledge_check;

import java.util.ArrayList;

public class ParallelTest {

	public static void main(String[] args) {
	     // Initialize two ArrayLists to store grades for two tests
        ArrayList<Integer> test1Grades = new ArrayList<Integer>();
        ArrayList<Integer> test2Grades = new ArrayList<Integer>();

        // Add grades for each test
        test1Grades.add(100);
        test2Grades.add(100);
        test1Grades.add(80);
        test2Grades.add(70);
        test1Grades.add(70);
        test2Grades.add(90);

        System.out.println("Test 1 Grades: " + test1Grades);
        System.out.println("Test 2 Grades: " + test2Grades);

        // Initialize variable to store total sum of grades
        double total = 0;

        // Traverse both ArrayLists simultaneously using index
        for (int i = 0; i < test1Grades.size(); i++) {
            System.out.println("Processing Test 1 Grade: " + test1Grades.get(i) +
                               " and Test 2 Grade: " + test2Grades.get(i));

            // Add corresponding grades from both tests to total
            total += test1Grades.get(i) + test2Grades.get(i);
            System.out.println("Total so far: " + total);
        }

        // Calculate total number of grades (2 tests * number of students)
        int numberOfGrades = test1Grades.size() * 2;
        System.out.println("Total Number of Grades: " + numberOfGrades);

        // Calculate average grade
        double average = total / numberOfGrades;
        System.out.println("Average over two tests: " + average);
    }


	}

