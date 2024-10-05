package com.bptn.course._14_custom_exception._01_custom_exception_1;

public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount (1000, "43455");
	try {	
		ba.withdraw(200);
		ba.withdraw(600);
		ba.withdraw(400);
	} catch (InsufficientFundException e) {
		System.out.println("Insufficient funds. You need $"+ e.getAmount()+ "more to complete this transaction");
	}

}
}
