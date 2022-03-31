package fr.fms.entities;

public class Admin extends Client {
	
	//Constructor
	
	public Admin(int id,int clientNumber,String lastName,String firstName,String address) {
		super(id,clientNumber,lastName,firstName,address);
	}
	
	public Client createClient(int id, int clientNumber, String lastName, String firstName, String address) {
		return new Client(id, clientNumber, lastName, firstName, address);
	}
	
	public Account createCurrentAccount(int accountNumber, int clientNumber, double amount, double authorizedOverdraft) {
		return new CurrentAccount(accountNumber, clientNumber, amount, authorizedOverdraft);
	}
	
	public Account createSavingAccount(int accountNumber, int clientNumber, double amount, double interestRate) {
		return new SavingAccount(accountNumber, clientNumber, amount, interestRate);
	}

	@Override
	public String toString() {
		return super.toString() +"";
	}
}

