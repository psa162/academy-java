package com.bptn.course._15_java_collection_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//1st way of declaring ArrayList
		//ArrayList<Integer>arrayList =new ArrayList<>();
		
		//2nd way of declaring ArrayList
		List<Integer> arrayList =new ArrayList<>();
		
		//add values into array list
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(400);
		arrayList.add(400);
		arrayList.add(null);
		arrayList.add(900);
		
		System.out.println(arrayList);
		//Size of the array list
		System.out.println(arrayList.size());
		
		//access the firt element
		System.out.println(arrayList.get(0));
		
		//Update element
		arrayList.set(2, 344);
		System.out.println(arrayList);
		
		//remove an element
		System.out.println(arrayList.remove(4));
		
		//accessing element using the traditional for loop
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//access the element using for-each loop
		for(Integer element: arrayList) {
			System.out.println(element);
		}

	}

}
//we need to rely on Abstraction rather than concrete implementation
// the first way of declaring is relying on concrete implementation which does not follow dependency inversion principle
//the 2nd of declaring 
//length of an array - array.length, whill array list is arrayList.size
