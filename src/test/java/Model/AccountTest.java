package Model;

import static org.junit.Assert.*;

public class AccountTest {

    @org.junit.Test
    public void createTest() {
        Account account = new Account(1000);
        assertEquals(1000, account.balance);
    }

    @org.junit.Test
    public void positiveUpdateBalance() {
        Account account = new Account(1000);
        account.updateBalance(100);
        assertEquals(1100, account.balance);
    }

    @org.junit.Test
    public void negativeUpdateBalance() {
        Account account = new Account(1000);
        account.updateBalance(-100);
        assertEquals(900, account.balance);
    }
}