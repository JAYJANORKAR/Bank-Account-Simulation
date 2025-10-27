package com.Bank_Account_Simulation;

import java.util.Scanner;

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = sc.nextDouble();

        Account account = new Account(name, initialDeposit);

        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wdAmount = sc.nextDouble();
                    account.withdraw(wdAmount);
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    account.viewTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}