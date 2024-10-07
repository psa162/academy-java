package com.bptn.course._15_java_collection_list._01_arraylist._array_coding_excercise._32coding_excercide;

public class Student {


	        private String name;
	        private int classGrade;

	        public Student(String name, int classGrade) {
	            this.name = name;
	            this.classGrade = classGrade;
	        }

	        public String getName() {
	            return this.name;
	        }

	        public int getClassGrade() {
	            return this.classGrade;
	        }

	        // overrides the default Object toString method;
	        public String toString() {
	            return "Student name is: " + name + " and student's class grade is: Grade " + classGrade;
	        }

	    }


