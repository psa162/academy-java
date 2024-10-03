package com.bptn.course._challenges;

import java.util.Scanner;

public class Player {

	    private String name;
	    private int playerNumber;

	    // Question: should scanner be static or not?
	    private static Scanner scanner = new Scanner (System.in);// complete line

	    public Player(String name, int playerNumber) {
	        // complete constructor
	    	this.name= name;
	    	this.playerNumber= playerNumber;
	    }

	    // create getter methods
	    public String getName() {
	        return name;
	    }

	    // Getter for player's number
	    public int getPlayerNumber() {
	        return playerNumber;
	    }

	    public int makeMove() {
	        System.out.println("Make your move. What column do you want to put a token in?");
	        int column = scanner.nextInt(); // receive user input
	        return column;
	    }

	    public String toString() {
	        return ("Player " + playerNumber + " is " + name);
	    }	
	
	
	
	public static void main(String[] args) {
		

	}

}
