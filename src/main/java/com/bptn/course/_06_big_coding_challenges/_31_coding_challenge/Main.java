package com.bptn.course._06_big_coding_challenges._31_coding_challenge;



public class Main {
	//Do not modify this code
		public static void main(String[] args) {
		    Store store = new Store();
		    try {
		        store.purchase("apple",10);
		        System.out.println("Purchase successful");
		    } catch (OutOfStockException e) {
		        System.out.println(e.getMessage());
		    }
		}
	}
