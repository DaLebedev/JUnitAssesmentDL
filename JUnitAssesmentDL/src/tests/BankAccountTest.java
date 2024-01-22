/**
 * @author Daniel Lebedev - dalebedev 
 * CIS 175 - Spring 2024
 * Jan 21, 2024
 */
package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.BankAccount;
import model.Transaction;

public class BankAccountTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitialBalance() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(0.0, bankAccount.getBalance(), 0.001);
		
	}
	
	@Test
	public void testNewBalance() {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(50.0);
		
		assertEquals(50.0, bankAccount.getBalance(), 0.001);
	}
	
	@Test
	public void testValidDeposit() {
		BankAccount bankAccount = new BankAccount();
		
		Transaction transaction = new Transaction(50.0, "Valid Deposit");
		bankAccount.deposit(transaction);
		
		assertEquals(50.0, bankAccount.getBalance(), 0.001);
		
	}
	
	@Test
	public void testInvalidDepositInput() {
		BankAccount bankAccount = new BankAccount();
		Transaction transaction = new Transaction(-50, "Invalid Deposit");
		
		assertThrows(IllegalArgumentException.class,
			() -> {
				bankAccount.deposit(transaction);
			});
	}
	
	@Test
	public void testValidWithdraw() {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(150);
		
		Transaction transaction = new Transaction(100.0, "Valid Withdrawal");
		bankAccount.withdraw(transaction);
		
		assertEquals(50.0, bankAccount.getBalance(), 0.001);
		
	}
	
	@Test
	public void testInvalidWithdrawInput() {
		BankAccount bankAccount = new BankAccount();
		
		Transaction transaction = new Transaction(-25.0, "Invalid Withdrawal Input");
		
		assertThrows(IllegalArgumentException.class,
			() -> {
				bankAccount.withdraw(transaction);
			});
	}
	
	@Test
	public void testInvalidWithdrawInsufficientFunds() {
		BankAccount bankAccount = new BankAccount();
		
		Transaction transaction = new Transaction(500.0, "Insufficient Funds");
		
		assertThrows(IllegalArgumentException.class,
			() -> {
				bankAccount.withdraw(transaction);
			});
	}
	
	@Test
	public void testBankAccountNotNull() {
		BankAccount bankAccount = new BankAccount();
		assertNotNull(bankAccount);
	}


}
