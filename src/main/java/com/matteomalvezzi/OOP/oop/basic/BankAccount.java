package com.matteomalvezzi.OOP.oop.basic;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){ this.balance += amount; }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) this.balance -= amount;
    }
}
