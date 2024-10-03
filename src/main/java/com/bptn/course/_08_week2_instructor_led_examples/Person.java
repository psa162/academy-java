package com.bptn.course._08_week2_instructor_led_examples;

public class Person {

	private String name;
    public Person(String name) {
       this.name = name;
    }
    @Override 
    public String toString() {
       return name;
    }
    public static void main(String[] args) {
       Person p = new Person("Sila");
       Student s = new Student("Tully", 1001);
      System.out.println(p); //call Person toString method
      System.out.println(s);  //call Student toString method

       //create an object of APStudent class and pass ("Tully", 1001, 90) as parameters
       APStudent aps = new APStudent("Tully", 1001, 90);
       System.out.println(aps);  //call APStudent toString method and print output on the console

       
    }
 }
