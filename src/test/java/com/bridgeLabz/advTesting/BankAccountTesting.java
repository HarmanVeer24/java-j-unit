package com.bridgeLabz.advTesting;

import com.bridgeLabz.advtesting.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTesting {
    @Test
    public void shouldCheckUpdatedBankBalance(){
        BankAccount.deposit(500);
        Assertions.assertEquals(BankAccount.getBalance(),500);
    }
    @Test
    public void shouldFailIfFundsAreInsufficient(){
        BankAccount.deposit(500);
        Assertions.assertThrows(IllegalArgumentException.class, ()-> BankAccount.withdraw(600));
    }
}
