package com.bptn.course._15_java_collection_list._01_arraylist._array_coding_excercise._33coding_excercide;

import java.util.List;
import java.util.ArrayList;
 
public class Main {
    
    // Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
    	List<String> newList = new ArrayList<>();

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
    	for (String s: inputArray) {
    		newList.add(s);
    	}
        // return the new list with elements.
    	
    	return newList;
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String[] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }
}
