package fr.fms.entities;

import java.util.Date;

public class SavingAccount extends Account {

	private double interestRate;

	public SavingAccount(int accountNumber, int clientNumber, double amount, Date createdAt, double interestRate) {
		super(accountNumber, clientNumber, amount, createdAt);
		this.interestRate = interestRate;
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
