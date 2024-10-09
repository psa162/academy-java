package com.bptn.course._15_java_collection_list._02_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {
	
	public static void main(String[] args) {
		
		LinkedList<String> colors = new LinkedList<>();
		 
		//Add elements to the list
		
		colors.addFirst("red");
		
		//Add elements to the end list
		colors.addLast("green");
		
		System.out.println("Linkedlist after adding colors" + colors);
		
		//remove element from the begining 
		colors.removeFirst();
		System.out.println("Linkedlist after removing 1st colors" + colors);
		
		// remove element from the end
		colors.removeLast();
		System.out.println("Linkedlist after removing last colors" + colors);
		
		System.out.println(colors);
		
		//add colors to list
		colors.add("orange");
		colors.add("ping");
		colors.add("burgandy");
		System.out.println(colors);
		
		//remove an element from index
		colors.remove(1);
		System.out.println("Linkedlist after removing element from index1st colors" + colors);
		
		 //add an element to index 1
		colors.add(1, "brown");
		System.out.println("Linkedlist after adding element to index1" + colors);
		
		//access an element at index 2
		System.out.println("Access an element at index 2" + colors.get(2));
		
		colors.add("yello");
		System.out.println("null is possible" + colors);
		
		//access element using a for-loop
		
		for(int i=0; i<colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		// Access elements in the LinkedList using for each loop
		for (String element: colors) {
			System.out.println(element);
		}
		
	
	
	System.out.println("Accessing the element using Iterator");
	
	Iterator<String> it = colors.iterator();
	
	while (it.hasNext()) {
		System.out.println("Accessing next element using Iterator: "+it.next());
	}
	
	//remove an element
	System.out.println("Removing an element using Iterator");
	Iterator<String>iterator=colors.listIterator();
	
	while (iterator.hasNext()) {
		String color = iterator.next();
		
		if(color.equals("brown")) {
			iterator.remove();
			System.out.println(" color removed succesfully");
			System.out.println(colors);
		}
	}
	
	//add element using list iterator
	// Create a ListIterator
    ListIterator<String> listIterator = colors.listIterator();
    while (listIterator.hasNext()) {
    	String color = listIterator.next();
    	
    	if(color.equals("orange")) {
    		listIterator.add("black");
    		System.out.println("The color is added successfully");
    	}
    }
	// remove an element 
    
    
	
	}
	
	

}

//linked list can have null values/duplicates/preserve insertion order
