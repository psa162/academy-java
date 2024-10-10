package com.bptn.course._17_java_collections_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main (String[] args) {
		
		Map<String, Integer> linkedHashMap= new LinkedHashMap<>();
		
		linkedHashMap.put("jane", 24); // it preserves instertion order
		linkedHashMap.put("Angie", 24);
		linkedHashMap.put("Steve", 24);
		linkedHashMap.put("Sweytha", 24);
		linkedHashMap.put("cain", null);//it allows null value
		linkedHashMap.put("Steve", 30);// it does not allow for duplicate
		
		System.out.println(linkedHashMap);
		
		//Access the value in the LinkedHasMap
		System.out.println("Jane age is "+ linkedHashMap.get("jane"));
		
		//loop over the LinkedHashMap using entrySet() method
		for (Map.Entry<String, Integer> entry: linkedHashMap.entrySet()) {
			
			
		}
		
	}

}
