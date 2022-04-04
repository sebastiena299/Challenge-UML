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

//	@Override
//	public void deposit(double deposit) {
//		if (deposit > 0) {
//			setAccountBalance(getAccountBalance() + deposit);
//			this.getOperationList().add(new Operation(this.getAccountNumber(),this.getClientNumber(),"Dépôt : "+ deposit));
//		} else {
//			System.out.println("Impossible de faire un virement négatif");
//		}
//
//	}

//	@Override
//	public void withdraw(double withdrawal) {
//		if(this.getAccountBalance() - withdrawal >= 0) {
//		setAccountBalance(getAccountBalance() - withdrawal);
//		this.getOperationList().add(new Operation(this.getAccountNumber(),this.getClientNumber(),"Retrait : "+ withdrawal));
//		}
//		else {
//			System.out.println("Découvert non autorisé");
//		}
//	}

//	@Override
//	public void transfer(double transfer, Account account) {
//		if (transfer > 0 && transfer <= getAccountBalance()) {
//			setAccountBalance(getAccountBalance() - transfer);
//			account.setAccountBalance(account.getAccountBalance() + transfer);
//			this.getOperationList().add(new Operation(this.getAccountNumber(),this.getClientNumber(),"Transfer : "+ transfer + " vers " + account.getAccountNumber()));
//			account.getOperationList().add(new Operation(account.getAccountNumber(),account.getClientNumber(),"Transfer : "+ transfer + " depuis " + account.getAccountNumber()));
//		}
//		
//		
//	}
	@Override
	public void consultation() {
		System.out.println("Compte : " + getAccountNumber() + " solde actuel : " + getAccountBalance()
				+ " Taux d'intérêt : " + getInterestRate());

	}

	@Override
	public double getAuthorizedOverdraft() {
		// TODO Auto-generated method stub
		return 0;
	}

}
