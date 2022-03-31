package fr.fms.entities;

public class Admin extends Client {
	private String createClient;
	private String createAccount;
	
	
	//Constructor
	public Admin(int id,int clientNumber,String lastName,String firstName,String address,String createClient,String createAccount) {
		super(id,clientNumber,lastName,firstName,address);
		
	}
	public String getCreateClient() {
		return createClient;
	}
	public void setCreateClient() {
		this.createClient = createClient;
	}
	public String getCreateAccount() {
		return createAccount;
	}
	public void setCreateAccount() {
		this.createAccount = createAccount;
	}
	@Override
	public String toString() {
		return super.toString() +"";
	}
}

