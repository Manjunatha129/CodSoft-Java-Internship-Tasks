package com.codsoft.atm;
import java.awt.DisplayMode;
import java.util.Scanner;

public class ATM {
	private BankAccount account;
	private Scanner scanner;
	
	
	public ATM(BankAccount account) {
		this.account = account;
		this.scanner = new Scanner(System.in);	
		
	}
	
	public void start() {
		int choice = 0;
		
		do {
			diplayMenu();
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				handleWithdraw();
				break;
				
			case 2:
				handleDeposite();
				break;
				
			case 3:
				displyBlance();
				break;
//			case 4:
//				displyLastTransaction();
//				break;
			case 4:
				exitATM();
				break;
			default:
				System.out.println("Invalid Option. Please Try Again");
			}
			
		}while(choice!=5);
	}
	
	
	private void diplayMenu() {
		System.out.println("--------------ATM DASHBOARD--------------");
		System.out.println("1. Withdraw Money");
		System.out.println("2. Deposite Money");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("------------------------------------------");

		
		System.out.println("Enter Your Choice");
		
	}
	
	private void handleWithdraw() {
		System.out.println("Enter Amount to Withdraw:");
		double amount = scanner.nextDouble();
		
		if(amount > 0) {
			account.withdraw(amount);
		}else {
			System.out.println("Invalid Withdrawal Amount.");
		}
		
	}
	
	private void handleDeposite() {
		System.out.println("Enter amount to deposite: ");
		double amount = scanner.nextDouble();
		
		if(amount > 0) {
			account.deposite(amount);
		}else {
			System.out.println("Invalid Deposite Amount");
		}
	}
	

	private void displyBlance() {
		
		System.out.println("Availble Balance "+account.getBalance());
	}	

	private void exitATM() {
		
		System.out.println("Thank you for Using ATM");
	}
	
}
