package com.bptn.course._Teach_back;

	//define a class
	public class AcademyMember {
		//declare the variable which holds the role of each academy member
	    String role;
	    
	   //declare the next variable which represent the next level in the academy
	    AcademyMember nextLevel;

	    //declare a constructor to initialize each members role for the object created
	    AcademyMember(String role) {
	        this.role = role;
	    }
	    // this is to link each academy member 
	    void setNextLevel(AcademyMember nextLevel) {
	        this.nextLevel = nextLevel;
	    }

	    //print hierarchy recursively
	    void showHierarchy() {
	        System.out.println("Role: " + role);
	        //base case
	        if (nextLevel != null) {
	        	  //Recursive call
	            nextLevel.showHierarchy();  // Recursion to move to the next level
	        }
	    }

	    public static void main(String[] args) {
	    	// creates the academy roles
	        AcademyMember director = new AcademyMember("Director");
	        AcademyMember instructor = new AcademyMember("Instuctor");
	        AcademyMember assistantInstuctor = new AcademyMember("Assistant Instuctor");
	        AcademyMember student = new AcademyMember("Student");

	        director.setNextLevel(instructor);
	        instructor.setNextLevel(assistantInstuctor);
	        assistantInstuctor.setNextLevel(student);
	        
	        //Recursive process
	        instructor.showHierarchy();  // Start recursion 
	    }
	}

	
   