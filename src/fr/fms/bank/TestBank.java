package fr.fms.bank;

import java.util.ArrayList;
import fr.fms.entities.Account;
import fr.fms.entities.Admin;
import fr.fms.entities.Client;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingAccount;

public class TestBank {
	
//	public Scanner scan = new Scanner(System.in);
//	int userClientNumber;
//	
//	public void authentification() {
//		System.out.println("Entrez votre num?ro client");
//		while(!scan.hasNextInt()) scan.next();
//		userClientNumber = scan.nextInt();	
//	}


	public static void main(String[] args) {
		
		ArrayList<Client> clients = new ArrayList<>();
		ArrayList<Account> accounts = new ArrayList<>();
		
		Client test = new Client(1, 44848, "Doe", "John", "Dax");
		Admin admin =  new Admin(1, 12, "Doe", "John", "Paris");
		Client totoClient = admin.createClient(2, 1654, "Fix", "Mathieu", "Dax");
		clients.add(test);
		clients.add(admin);
		clients.add(totoClient);
		
		CurrentAccount compte = admin.createCurrentAccount(40,totoClient.getClientNumber(),0,-200);
		SavingAccount epargne = new SavingAccount(41,totoClient.getClientNumber(),0,1);
		accounts.add(compte);
		accounts.add(epargne);
		
		accounts.stream()
			.filter(client -> client.getClientNumber() == 1654)
			.forEach(account -> account.consultation());
	
		System.out.println(test);
		System.out.println(admin);
		System.out.println(totoClient);
		System.out.println(" ");
		
		compte.consultation();
		compte.deposit(500);
		compte.consultation();
		compte.withdraw(300);
		compte.consultation();
		compte.withdraw(40000000);
		compte.transfer(100, epargne);
		compte.consultation();
		epargne.consultation();
		
		compte.displayOperationList();
		
		
		
		
	}

}
