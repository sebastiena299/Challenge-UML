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

	@Override
	public void deposit(double deposit) {
		if (deposit>0) {
			setAccountBalance(getAccountBalance() + deposit);
			this.getOperationList().add(new Operation(this.getAccountNumber(),this.getClientNumber(),"Dépôt : "+ deposit));
		}
		else {
			System.out.println("Impossible de faire un virement négatif");
		}
		
	}

	@Override
	public void withdraw(double withdrawal) {
		
		if (getAccountBalance() - withdrawal > authorizedOverdraft) {
			setAccountBalance(getAccountBalance() - withdrawal);
			this.getOperationList().add(new Operation(this.getAccountNumber(),this.getClientNumber(),"Retrait : "+ withdrawal));
		}
		
		else {
			System.out.println("vous ne pouvez pas dépasser le découvert autorisé (" + authorizedOverdraft+ ")");
		}
	}

	@Override
	public void transfer(double transfer, Account account) {
		if (transfer > 0 && transfer < getAccountBalance()) {
			setAccountBalance(getAccountBalance() - transfer);
			account.setAccountBalance(account.getAccountBalance() + transfer);
			this.getOperationList().add(new Operation(this.getAccountNumber(),this.getClientNumber(),"Transfer : "+ transfer + " vers " + account.getAccountNumber()));
			account.getOperationList().add(new Operation(account.getAccountNumber(),account.getClientNumber(),"Transfer : "+ transfer + " depuis " + account.getAccountNumber()));
		}
		
		
	}

	@Override
	public void consultation() {
		System.out.println("Compte : " + getAccountNumber() + " solde actuel : " + getAccountBalance());
		
	

	
		
	}

	
}
