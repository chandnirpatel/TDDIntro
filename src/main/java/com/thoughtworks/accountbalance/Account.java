package com.thoughtworks.accountbalance;

/**
 * Created by Chandni
 */
public class Account {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if(withdrawalAmount <= balance) balance -= withdrawalAmount;
    }
}
