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

	@Override
	public void deposit(double deposit) {
		if (deposit > 0) {
			setAccountBalance(getAccountBalance() + deposit);
		} else {
			System.out.println("Impossible de faire un virement négatif");
		}

	}

	@Override
	public void withdraw(double withdrawal) {

		setAccountBalance(getAccountBalance() - withdrawal);
	}

	@Override
	public void transfer(double transfer, Account account) {
		if (transfer > 0 && transfer <= getAccountBalance()) {
			setAccountBalance(getAccountBalance() - transfer);
			account.setAccountBalance(account.getAccountBalance() + transfer);
		}
		
		
	}
	@Override
	public void consultation() {
		// TODO Auto-generated method stub

	}

}
