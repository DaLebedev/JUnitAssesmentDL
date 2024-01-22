/**
 * @author Daniel Lebedev - dalebedev 
 * CIS 175 - Spring 2024
 * Jan 21, 2024
 */
package model;

public class Transaction {
	
	private double amount;
	private String description;
	
	public Transaction( double amount, String description) {
		this.amount = amount;
		this.description = description;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
