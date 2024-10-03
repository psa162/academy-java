package com.bptn.course._08_week2_instructor_led_examples;

public class Student extends Person {

	private int id;
    public Student(String name, int id) {
       super(name);
       this.id = id;
    }
   @Override
    public String toString() {
       return super.toString() + " 100 " + id;
    }
}