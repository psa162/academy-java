package com.bptn.course._06_big_coding_challenges;

import java.util.Arrays;

//we defined a public class
public class BinarySearch {

 // Define a static method named binarySearch that takes an integer array and an integer key as input
 // This method will perform a binary search on the array to find the key
 public static int binarySearch(int[] arr, int key) {

     // Sort the input array in ascending order using the Arrays.sort() method
     // This is necessary because binary search only works on sorted arrays
     Arrays.sort(arr); // Sorting the array

     // Initialize two pointers, low and high, to represent the start and end of the array
     // These pointers will be used to traverse the array during the binary search
     int low = 0; // Starting index of the array
     int high = arr.length - 1; // Ending index of the array

     // Start a while loop that will continue as long as the high index is greater than or equal to the low index
     // This loop will repeatedly divide the array in half until the key is found or the array is exhausted
     while (high >= low) {

         // Calculate the middle index of the array by averaging the low and high indices
         // This will give us the midpoint of the current range
         int mid = (low + high) / 2; // Calculating the midpoint

         // Check if the element at the middle index is equal to the key we're searching for
         // If it is, we've found the key and can return its index
         if (arr[mid] == key) {

             // Return the index of the key
             return mid; // Key found, returning its index

         } 
         // If the element at the middle index is less than the key, move the low index to mid + 1
         // This effectively searches the right half of the array
         else if (arr[mid] < key) {
             low = mid + 1; // Searching the right half

         } 
         // If the element at the middle index is greater than the key, move the high index to mid - 1
         // This effectively searches the left half of the array
         else {
             high = mid - 1; // Searching the left half
         }
     }

     // If the while loop ends without finding the key, return -1 to indicate that the key was not found
     // This is the default return value if the key is not in the array
     return -1; // Key not found, returning -1
 }

 // Define a public static main method to test the binarySearch method
 public static void main(String[] args) {

     // Create an integer array named arr to test the binarySearch method
     // This array will be used to demonstrate the binary search algorithm
     int[] arr = {5, 2, 8, 1, 9}; // Test array

     // Define an integer key to search for in the array
     // This key will be used to test the binarySearch method
     int key = 8; // Test key

     // Call the binarySearch method with the array and key as input, and store the result in a variable named result
     // This will perform the binary search and return the index of the key if found
     int result = binarySearch(arr, key); // Performing the binary search

     // Check if the result is not equal to -1, indicating that the key was found
     // If the key was found, print a message to the console indicating its index
     if (result != -1) {

         // Print a message to the console indicating that the key was found at the specified index
         System.out.println("Element found at index " + result); // Printing the result

     } 
     // If the result is equal to -1, indicating that the key was not found
     // Print a message to the console indicating that the key was not found in the array
     else {

         // Print a message to the console indicating that the key was not found in the array
         System.out.println("Element not found in the array"); // Printing the result
     }
 }
}