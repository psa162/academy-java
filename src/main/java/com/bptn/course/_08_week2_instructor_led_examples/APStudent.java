package com.bptn.course._08_week2_instructor_led_examples;

public class APStudent extends Student {

	
	    private int apScore;

	    public APStudent(String name, int id, int apScore) {
	        super(name, id);
	        this.apScore = apScore;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " " + apScore;
	    }
	}
	


