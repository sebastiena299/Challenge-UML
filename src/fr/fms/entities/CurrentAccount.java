package fr.fms.entities;

public class CurrentAccount extends Account {

	private double authorizedOverdraft;

	public CurrentAccount(int accountNumber, int clientNumber, double accountBalance, double authorizedOverdraft) {
		super(accountNumber, clientNumber, accountBalance);
		this.authorizedOverdraft = authorizedOverdraft;

	}

	public double getAuthorizedOverdraft() {
		return authorizedOverdraft;
	}

	public void setAuthorizedOverdraft(double authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}

}
