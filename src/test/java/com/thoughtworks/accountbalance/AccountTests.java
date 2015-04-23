package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account(100.0);
        account.deposit(50.0);
        assertThat(account.getBalance(), is(150.0));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        Account account = new Account(100.0);
        account.withdrawal(50.0);
        assertThat(account.getBalance(), is(50.0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50.0);
        account.withdrawal(100.00);
        assertThat(account.getBalance(), is(50.0));
    }
}

