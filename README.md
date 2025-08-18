# Bank Management System (Java)

Simple OOP project to manage bank accounts, customers, and operations.

## Features
- Accounts (checking/savings): deposit, withdraw, transfer
- Customers management
- Roles: BankTeller, BankManager
- Interfaces (Transactional, Reportable)
- Exceptions (InsufficientFunds, AccountNotFound)
- CSV file persistence (save/load)

## Structure
src/
  app/Main.java
  bank/
    Account.java
    AccountType.java
    CheckingAccount.java
    SavingsAccount.java
    Customer.java
    BankTeller.java
    BankManager.java
    exceptions/
      InsufficientFundsException.java
      AccountNotFoundException.java
    interfaces/
      Transactional.java
      Reportable.java

## Build & Run
javac -d out $(find src -name "*.java")
java -cp out app.Main
