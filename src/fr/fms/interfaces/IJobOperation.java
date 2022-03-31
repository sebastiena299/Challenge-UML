package fr.fms.interfaces;

import fr.fms.entities.Account;

public interface IJobOperation {
	
	public void consultation();
	public void transfer(double transfer, Account account);
	public void deposit(double deposit);
	public void withdraw(double withdrawal);
	
}
