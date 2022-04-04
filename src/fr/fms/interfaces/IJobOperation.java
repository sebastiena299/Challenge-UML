package fr.fms.interfaces;

import fr.fms.entities.Account;

public interface IJobOperation {

	public void consultation(Account account);

	public void transfer(double transfer, Account account, Account receiver);

	public void deposit(double deposit, Account account);

	public void withdraw(double withdrawal, Account account);

}
