package fr.fms.bank;

import fr.fms.entities.Admin;
import fr.fms.entities.Client;

public class TestBank {

	public static void main(String[] args) {
		
		Client test = new Client(1, 44848, "Doe", "John", "Dax");
		System.out.println(test);
		
		Admin admin =  new Admin(1, 12, "Doe", "John", "Paris");
		
		Client totoClient = admin.createClient(2, 1654, "Fix", "Mathieu", "Dax");
		
		System.out.println(admin);
		System.out.println(totoClient);
		
	}

}
