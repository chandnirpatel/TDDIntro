package com.thoughtworks.accountbalance;

/**
 * Created by Chandni on 4/5/15.
 */
public class Account {
    public double balance;

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
