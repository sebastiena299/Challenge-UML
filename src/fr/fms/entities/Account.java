package fr.fms.entities;

import java.util.Date;

public class Account {

	private int accountNumber;
	private int clientNumber;
	private double amount;
	private Date createdAt;
	
	public Account (int accountNumber,  int clientNumber, double amount, Date createdAt) {
		this.accountNumber = accountNumber;
		this.clientNumber = clientNumber;
		this.amount = amount;
		this.createdAt = createdAt;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
