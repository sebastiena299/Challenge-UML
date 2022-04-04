package fr.fms.bank;

import java.util.ArrayList;
import fr.fms.entities.Account;
import fr.fms.entities.Admin;
import fr.fms.entities.Client;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingAccount;
import fr.fms.interfaces.IJobOperationImpl;


public class TestBank {
	
     static IJobOperationImpl job = new IJobOperationImpl();

	public static void main(String[] args) {
		
		ArrayList<Client> clients = new ArrayList<>();
		ArrayList<Account> accounts = new ArrayList<>();
		
		Client john = new Client(1, 44848, "Doe", "John", "Dax");  //ajoute un nouveau client
		Admin admin =  new Admin(1, 12, "Doe", "John", "Paris");   //ajoute un nouvel admin
		Client mathieu = admin.createClient(2, 1654, "Fix", "Mathieu", "Dax");  //créer un client depuis admin
		
		clients.add(john);              
		clients.add(admin);
		clients.add(mathieu);
		
		CurrentAccount compte = admin.createCurrentAccount(40,mathieu.getClientNumber(),0,-200); //créer un compte courant depuis admin
		SavingAccount epargne = new SavingAccount(41,mathieu.getClientNumber(),0,1);  // créer un compte épargne depuis admin
		mathieu.setAccounts(compte);
		mathieu.setAccounts(epargne);
		
		accounts.add(compte);
		accounts.add(epargne);
		
		accounts.stream()
			.filter(client -> client.getClientNumber() == 1654)
			.forEach(account -> account.consultation());
	
		System.out.println(john);
		System.out.println(admin);
		System.out.println(mathieu);
		System.out.println(" ");
		
		job.consultation(compte);
		job.deposit(500, compte);
		job.consultation(compte);
		job.withdraw(300, compte);
		job.consultation(compte);
		job.withdraw(40000000, compte);
		job.transfer(100, compte, epargne);
		job.consultation(compte);
		epargne.consultation();
		
		compte.displayOperationList();
		
		
		
		
	}

}
