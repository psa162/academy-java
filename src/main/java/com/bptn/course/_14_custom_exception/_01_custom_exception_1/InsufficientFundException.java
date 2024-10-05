package com.bptn.course._14_custom_exception._01_custom_exception_1;

//can extend either Exception class or RuntimeException class
public class InsufficientFundException extends Exception {
	
	private static final long serialVersionUID =1L;
	
	private double amount;

	public InsufficientFundException(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	
	}

	
		
	

