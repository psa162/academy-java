package com.bptn.course._21_sorting_algorithm;

import java.util.Arrays;

public class BubbleSort {
	
	static void bubbleSort(int array[]) {
		
int size= array.length;

		//loop for every arrray element 
for (int i=0; i< size -1; i++) {
	//loop for comparison
	for (int j=0; j<size-1; j++) {
		//comparison
		
		//if value on right is less than value on left we swap
		if(array[j]> array[j+1]) {
			int temp =array[j];
			array[j]=array[j+1];
			array[j+1] =temp;
		}
	}
		
	}
	}

	public static void main(String[] args) {
		int[] data = {5,3,-1,7,20,2};
		
		System.out.println("Before sort"+ Arrays.toString(data));
		BubbleSort.bubbleSort(data);
		System.out.println("After sort"+ Arrays.toString(data));
		

	}

}
