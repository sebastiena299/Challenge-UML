package fr.fms.entities;

import java.util.ArrayList;
import java.util.Date;

import fr.fms.interfaces.IJobOperation;

public abstract class Account implements IJobOperation {
	
	//Attributs

	private int accountNumber;
	private int clientNumber;
	private double accountBalance;
	private Date createdAt;
	private ArrayList<Operation> operationList;
	
	//Constructeurs

	public Account(int accountNumber, int clientNumber, double accountBalance) {
		setAccountNumber(accountNumber);
		setClientNumber(clientNumber);
		setAccountBalance(accountBalance);
		setCreatedAt(new Date());
		operationList = new ArrayList<Operation>();
	}
	
	//Méthodes

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public ArrayList<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(ArrayList<Operation> operationList) {
		this.operationList = operationList;
	}

	public abstract void deposit(double deposit);

	public abstract void withdraw(double withdrawal); 
	
	public abstract void transfer(double transfer, Account account); 
	
	public abstract void consultation();
	
	public void displayOperationList() {
		
		for (int i = 0;i < this.getOperationList().size();i++) {
			System.out.println(this.getOperationList().get(i));
		}
		
	}

}
