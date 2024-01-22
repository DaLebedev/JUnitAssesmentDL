/**
 * @author Daniel Lebedev - dalebedev 
 * CIS 175 - Spring 2024
 * Jan 21, 2024
 */
package model;

public class BankAccount {
	
	private double balance;
	
	// Sets balance to $0.00 by default
	public BankAccount() {
		this.balance = 0.00;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(Transaction transaction) {
		
		double amount = transaction.getAmount();

		if (amount > 0) {
			balance += amount;
		}
		else {
			throw new IllegalArgumentException("Deposit must be a positive number");
		}	
	}

	public void withdraw(Transaction transaction) {
		
		double amount = transaction.getAmount();
		
		if (amount <= balance) {
			if (amount > 0) {
				balance -= amount;
			}
			else {
				throw new IllegalArgumentException("Withdrawal must be a positive number");
			}
		}
		else {
			throw new IllegalArgumentException("Insufficient funds in balance: $" + balance);
		}
	}
}
