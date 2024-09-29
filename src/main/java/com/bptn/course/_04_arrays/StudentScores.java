package com.bptn.course._04_arrays;

public class StudentScores {

	public static void main(String[] args) {
		//define an array of students scores
	int [] studentScores = {85, 90, 78, 92, 88};
	
		//create loop
	for (int i=0; i < studentScores.length; i++) {
		
		System.out.println("Student " + (i + 1) + ": " + studentScores[i]);
	}

	}

}
