package com.bptn.course._self_led;

public class Searcher {
	public static void sort(int[] elem) {
        for (int j = 0; j < elem.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elem.length; k++) {
                if (elem [k] < elem [minIndex]) {
                    minIndex = k;
                }
            }
            int temp = elem[j];
            elem[j] = elem[minIndex];
            elem[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {28, -3, 2, 14, 30};
        Searcher.sort(nums);
    }
}