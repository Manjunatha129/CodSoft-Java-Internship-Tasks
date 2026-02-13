package com.codsoft.atm;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create a bank account with initial balance
        BankAccount account = new BankAccount(5000);
        System.out.println();

        // Step 2: Create ATM object and link bank account
        ATM atm = new ATM(account);

        // Step 3: Start ATM operations
        atm.start();
    }
}