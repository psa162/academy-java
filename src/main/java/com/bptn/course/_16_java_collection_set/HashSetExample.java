package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		//create an object of HashSet
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple"); //hashSet does not allow duplicates
		hashSet.add(null);// allows max null value
		
		System.out.println("The hashset of fruits: "+ hashSet);
		
		

	}

}
//incert