package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		//create new strings ---> String variable name
		String s = "hello world";
		
		String reversedWord="";
		
		//find the total length
		int stringLength = s.length();
		
		System.out.println("The length of the string is : " + stringLength);
		
		//substring() menthod- to get a part of the String
		
		String sub = s.substring(0, 8);
		System.out.println("Substring with start index 0 and end index 8: "+ sub);
		
		String sub1 = s.substring(3);
		System.out.println("Substring with start index 3: "+ sub1);
		
		//convert to lower case 
		
		String low = s.toLowerCase();
		System.out.println("The lowercase of the string is: "+ low);
		
		//convert to upper case
		String upper = s.toUpperCase();
		System.out.println("The lowercase of the string is: "+ upper);
		
		int index = s.indexOf("world");
		System.out.println("The index: " + index);
		
		char c = s.charAt(0);
		
		System.out.println("The letter at index 0: " +c);
		
		for (int i=s.length()-1; i>=0; i--) {
			reversedWord += s.charAt(i);
			
			
		}
		System.out.println("Reverse word: "+ reversedWord);
	}
}
