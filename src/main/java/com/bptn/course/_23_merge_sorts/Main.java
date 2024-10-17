package com.bptn.course._23_merge_sorts;
import java.util.Arrays;



class Main {

    public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // Create an instance of the Main class
        Main main = new Main();

        // sort array
        main.mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }

    // Merges two subarrays of arr[].
    void merge(int arr[], int start, int mid, int end) {
        // Create temporary arrays
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        // Copy values from arr into temp left and right arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = start;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            // Find the middle point
            int mid = start + (end - start) / 2;

            // Sort first and second halves
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            // Merge the sorted halves
            merge(arr, start, mid, end);
        }
    }
}