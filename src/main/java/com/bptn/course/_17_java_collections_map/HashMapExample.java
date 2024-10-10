package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		//create an object
		Map<String, Integer> hashMap = new HashMap<>();
		
		//K--> key---> String
		//V---> Value---> Integer
		hashMap.put("Angie",33);
		hashMap.put("Steve",34);
		hashMap.put("John",35);
		hashMap.put("Jane",32);
		hashMap.put("Angie",34);
		hashMap.put("Swethan",50);
		hashMap.put(null, 30);
		hashMap.put(null, 20);
		
		
		System.out.println(hashMap);
		
		//keySet method
		for(String key: hashMap.keySet()) {
			
			System.out.println("Name" + key+ "Age" +hashMap.get(key));
			
			// retrieve the age of John and print iit to the console
			System.out.println("Age of John is: "+hashMap.get("John"));
			
			//i want to update johns age
			hashMap.replace("jane", 40);
			System.out.println("New age of jane"+ hashMap.get("Jane"));
			// check if key is present in the map using containsKey(Object k) method
			if (hashMap.containsKey("Jane")){
				
				System.out.println("The key is existing in the map");
			} else {
				System.out.println("The key is not existing in the map");
			}
			
			//check if the key is present in the map using  containsValue(object v) method
			if (hashMap.containsKey(34)) {
				System.out.println("The valie is existing in the map");
				
			} else {
				System.out.println(" the value is not existing in the map");
			}
			//putIfAbsent (Object k, Object v) is used to add a key value pair if a key does not exist in the map
			hashMap.putIfAbsent("swethan", 60);// it does not override age 50 for swethan
			
			System.out.println(hashMap);
			
			
			//Iterating throught the HashMap using the entrySet() method
			for (Map.Entry<String,Integer> entry: hashMap.entrySet()) {
				
				System.out.println("Name:"+ entry.getKey() + "Age"+ entry.getValue());
			}
		}
		

	}

}

//Major Key Take aways:
//it does not preserve insertion order
// does not allow duplicate and overwrite the first key
//values can consist of null value and similar to a set
