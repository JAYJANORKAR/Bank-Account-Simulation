package com.Bank_Account_Simulation;

import java.util.ArrayList;

class Account {
	private String accountHolder;
	private double balance;
	private ArrayList<String> transactionHistory;

	public Account(String accountHolder, double initialBalance) {
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
		this.transactionHistory = new ArrayList<>();
		transactionHistory.add("Account created with balance: " + initialBalance);
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
			System.out.println("Deposit successful!");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			transactionHistory.add("Withdrawn: " + amount + " | New Balance: " + balance);
			System.out.println("Withdrawal successful!");
		} else if (amount > balance) {
			System.out.println("Insufficient funds!");
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	public void viewBalance() {
		System.out.println("Current Balance: " + balance);
	}

	public void viewTransactionHistory() {
		System.out.println("Transaction History for " + accountHolder + ":");
		for (String record : transactionHistory) {
			System.out.println(" - " + record);
		}
	}
}