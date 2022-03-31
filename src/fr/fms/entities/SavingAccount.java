package fr.fms.entities;

public class SavingAccount extends Account {

	private double interestRate;

	public SavingAccount(int accountNumber, int clientNumber, double accountBalance, double interestRate) {
		super(accountNumber, clientNumber, accountBalance);
		this.interestRate = interestRate;
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
