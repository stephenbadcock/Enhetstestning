package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    @Test
    public void testCreateNewAccount() {
        Account account = new Account(100);

        assertEquals(100, account.balance);
    }

    @Test
    public void testMakeDeposit() {
        Account account = new Account(100);

        account.makeDeposit(50);

        assertEquals(150, account.balance);
    }

    @Test
    public void testMakeWithdrawal() {
        Account account = new Account(100);

        account.makeWithdrawal(50);

        assertEquals(50, account.balance);
    }

    @Test
    public void testGetBalance() {
        Account account = new Account(100);

        account.getBalance();

        assertEquals(100, account.getBalance());
    }

    @Test
    public void testAddInterestToBalance() {
        Account account = new Account(1000);

        account.addInterestToBalance(1.04);

        assertEquals(1040, account.getBalance());
    }
}