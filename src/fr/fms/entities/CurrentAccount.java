package fr.fms.entities;

import java.util.Date;

public class CurrentAccount extends Account {

	private double authorizedOverdraft;

	public CurrentAccount(int accountNumber, int clientNumber, double amount, Date createdAt,
			double authorizedOverdraft) {
		super(accountNumber, clientNumber, amount, createdAt);
		this.authorizedOverdraft = authorizedOverdraft;

	}

	public double getAuthorizedOverdraft() {
		return authorizedOverdraft;
	}

	public void setAuthorizedOverdraft(double authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}

}
