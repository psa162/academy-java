package com.bptn.course._16_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//create an object of a TreeSet
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("mango");
		treeSet.add("cherry");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("pineapple");
		
		treeSet.add("mango");// it does not allow duplicates
		
		System.out.println("TreeSet is " +treeSet);
		
		

	}

}
