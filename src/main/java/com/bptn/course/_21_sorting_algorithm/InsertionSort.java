package com.bptn.course._21_sorting_algorithm;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSort(int[] array) {
		int size = array.length;
		
		//outer loop for each index
		for(int i=1; i< size; i++) {
			int key = array[i];
			int j =i-1;
			//innerloop
		while (j>=0 && array[j]>key) {
			array[j +1]= array[j];
			j=j-1;
		}
		array[j+1]=key;
		}
	}

	public static void main(String[] args) {
	int[] data = {5,3,-1,7,20,2};
		
		System.out.println("Before sort"+ Arrays.toString(data));
		insertionSort(data);
		System.out.println("After sort"+ Arrays.toString(data));
		

	}

}
