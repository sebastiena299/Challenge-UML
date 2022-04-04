package fr.fms.interfaces;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Operation;
import fr.fms.entities.SavingAccount;

public class IJobOperationImpl implements IJobOperation {

	public void withdraw(double withdrawal, Account account) {

		if (account instanceof CurrentAccount) {

			if (account.getAccountBalance() - withdrawal > account.getAuthorizedOverdraft()) {
				account.setAccountBalance(account.getAccountBalance() - withdrawal);
			account.getOperationList().add(new Operation(account.getAccountNumber(),account.getClientNumber(),"Retrait : "+ withdrawal));
		}
			
		else {				System.out.println("vous ne pouvez pas dépasser le découvert autorisé (" + account.getAuthorizedOverdraft()+ ")");
			}
		}
	
		if (account instanceof SavingAccount) {

			if (account.getAccountBalance() - withdrawal >= 0) {
				account.setAccountBalance(account.getAccountBalance() - withdrawal);
				account.getOperationList().add(new Operation(account.getAccountNumber(), account.getClientNumber(),
						"Retrait : " + withdrawal));
			} else {
				System.out.println("Découvert non autorisé");
			}
		}

	}

	public void transfer(double transfer, Account account, Account receiver) {
		if (account instanceof CurrentAccount) {
			if (transfer > 0 && transfer <= account.getAccountBalance()) {
				account.setAccountBalance(account.getAccountBalance() - transfer);
				receiver.setAccountBalance(receiver.getAccountBalance() + transfer);
				account.getOperationList().add(new Operation(account.getAccountNumber(), account.getClientNumber(),
						"Transfer : " + transfer + " vers " + receiver.getAccountNumber()));
				receiver.getOperationList().add(new Operation(receiver.getAccountNumber(), receiver.getClientNumber(),
						"Transfer : " + transfer + " depuis " + account.getAccountNumber()));
			}

		}
	 if (account instanceof SavingAccount) {
		 
		 if (transfer > 0 && transfer <= account.getAccountBalance()) {
				account.setAccountBalance(account.getAccountBalance() - transfer);
				receiver.setAccountBalance(receiver.getAccountBalance() + transfer);
				account.getOperationList().add(new Operation(account.getAccountNumber(),account.getClientNumber(),"Transfer : "+ transfer + " vers " + receiver.getAccountNumber()));
				receiver.getOperationList().add(new Operation(receiver.getAccountNumber(),receiver.getClientNumber(),"Transfer : "+ transfer + " depuis " + account.getAccountNumber()));
			}
			
			
		} }
	
	 public void deposit(double deposit, Account account) {
		 if (account instanceof CurrentAccount) {
			if (deposit > 0) {
				account.setAccountBalance(account.getAccountBalance() + deposit);
				account.getOperationList()
						.add(new Operation(account.getAccountNumber(), account.getClientNumber(), "Dépôt : " + deposit));
			} else {
				System.out.println("Impossible de faire un virement négatif");
			}

		}
		 if (account instanceof SavingAccount) {
				if (deposit > 0) {
					account.setAccountBalance(account.getAccountBalance() + deposit);
					account.getOperationList().add(new Operation(account.getAccountNumber(),account.getClientNumber(),"Dépôt : "+ deposit));
				} else {
					System.out.println("Impossible de faire un virement négatif");
				}

			}
	 }
	 
	 public void consultation(Account account) {
		 if (account instanceof SavingAccount) {
		 System.out.println("Compte : " + account.getAccountNumber() + " solde actuel : " + account.getAccountBalance()
			+ " Taux d'intérêt : " + account.getInterestRate());
	 }
		 if (account instanceof CurrentAccount) {
			 System.out.println("Compte : " + account.getAccountNumber() + " solde actuel : " + account.getAccountBalance());
			 
		 }
	 
	}}


