package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExamples {

	public static void main(String[] args) {
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("apple");
		linkedHashSet.add("banana");
		linkedHashSet.add("cherry");
		linkedHashSet.add("mango");
		linkedHashSet.add("apple");// it does not allow duplicate
		
		System.out.println("The linkedHashset is: "+ linkedHashSet);

	}

}
