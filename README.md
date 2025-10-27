## Bank Account Simulation

## Overview
SimBanker is a console-based Java application that simulates real-world banking operations using Object-Oriented Programming (OOP) principles.
It allows users to create accounts, deposit and withdraw money, and view balances and transaction histories through an interactive menu.

---

## Objective
- To simulate basic bank operations and understand OOP concepts such as:
  1. Classes and Objects
  2. Encapsulation
  3. Data abstraction
  4. Realistic financial transaction management
 
  ---

## Features
1. Create a new bank account
2. Deposit money
3. Withdraw funds (with balance check)
4. View account balance
5. View transaction history
6. Interactive menu-driven interface

---

## Concepts Used

1. Class and Object – Representing bank accounts
2. Encapsulation – Protecting balance data
3. ArrayList – Managing transaction history
4. Conditional Statements – For validation checks
5. Loops – For continuous menu operation

---

## Technology Used
Language: Java
IDE: VS Code / IntelliJ / Eclipse
JDK: 8 or above

---

## How to Run (Without CMD)

## VS Code
1. Open VS Code → Install “Extension Pack for Java.”
2. Open your project folder SimBanker/.
3. Open BankAccountSimulation.java.
4. Click Run at the top or press Ctrl + F5.

## Using IntelliJ IDEA
1. Open IntelliJ → Click File → Open → SimBanker.
2. Right-click BankAccountSimulation.java → Run.

## Using Eclipse
1. Create a new Java project → Copy both .java files into src.
2. Right-click BankAccountSimulation.java → Run As → Java Application.

---

## Example Output
Enter account holder name: Jay
Enter initial deposit: 1000

===== BANK MENU =====
1. Deposit
2. Withdraw
3. View Balance
4. View Transaction History
5. Exit
Enter your choice: 1
Enter amount to deposit: 500
Deposit successful!

Enter your choice: 2
Enter amount to withdraw: 300
Withdrawal successful!

Enter your choice: 3
Current Balance: 1200.0

Enter your choice: 4
Transaction History for Jay:
 - Account created with balance: 1000
 - Deposited: 500 | New Balance: 1500
 - Withdrawn: 300 | New Balance: 1200

---

## Learning Objectives
By completing this project, you will:
- Understand the structure of a Java OOP program.
- Learn how to use classes, objects, and methods effectively.
- Implement real-world logic like deposits and withdrawals.
- Gain experience in user input handling and data validation.
- Manage data persistence (transaction history) using ArrayList.

---

## Conclusion
The SimBanker project demonstrates how Java’s OOP principles can be applied to build a simple yet practical banking system.
It strengthens your understanding of data encapsulation, method-based operations, and object management — key skills for real-world Java development.
