package fr.fms.entities;

public class Admin extends Client {
	
	private boolean isAdmin = true;
	
	//Constructor
	
	public Admin(int id,int clientNumber,String lastName,String firstName,String address) {
		super(id,clientNumber,lastName,firstName,address);
	}
	
	// Méthodes
	
	public Client createClient(int id, int clientNumber, String lastName, String firstName, String address) {
		return new Client(id, clientNumber, lastName, firstName, address);
	}
	
	public CurrentAccount createCurrentAccount(int accountNumber, int clientNumber, double accountBalance, double authorizedOverdraft) {
		return new CurrentAccount(accountNumber, clientNumber, accountBalance, authorizedOverdraft);
	}
	
	public SavingAccount createSavingAccount(int accountNumber, int clientNumber, double accountBalance, double interestRate) {
		return new SavingAccount(accountNumber, clientNumber, accountBalance, interestRate);
	}
	
	public boolean getIsAdmin() {
		return isAdmin;
	}

	@Override
	public String toString() {
		return super.toString() +"";
	}
}

