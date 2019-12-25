package main.java.MasterClass.DebuggingTest;

import main.java.MasterClass.Debugging.BankAccount;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bank = new BankAccount("bob", "lee", 1000);
        double balance = bank.deposit(200, true);
        assertEquals(1200.00, balance, 0);
        assertEquals(1201.00, bank.getBalance(), 0);
    }

    @org.junit.Test
    public void withdraw() {
    }

    @org.junit.Test
    public void getBalance() {
    }
}