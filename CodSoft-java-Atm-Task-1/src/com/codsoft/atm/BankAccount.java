package com.codsoft.atm;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalamce) {
		this.balance = initialBalamce;
		
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited Successfully.");
		}else {
			System.out.println("Invalid deposite amount.");
		}
		
		
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Withdrawal amount.");
		}else if(amount > balance) {
			System.out.println("Insufficient balance.");
		}else {
			balance -= amount;
			System.out.println(amount + " Amount Withdrawl Succesfully Please collect your cash.");
		}
	}
	
	public double getBalance() {
		return balance;
	}

}
