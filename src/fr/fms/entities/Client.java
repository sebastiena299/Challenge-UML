package fr.fms.entities;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Client {
	
	// Variables
	
	private int id;
	private int clientNumber;
	private String lastName;
	private String firstName;
	private String address;
	private Date createdAt;
	private boolean isAdmin = false;
	ArrayList<Account> accounts;
	
	// Constructors
	
	public Client(int id, int clientNumber, String lastName, String firstName, String address) {
		setId(id);
		setClientNumber(clientNumber);
		setLastName(lastName);
		setFirstName(firstName);
		setAddress(address);
		setCreatedAt(new Date());
		accounts = new ArrayList<>();
	}
	
	// Getters & Setters
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Account account) {
		this.accounts.add(account);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public boolean getIsAdmin() {
		return isAdmin;
	}
	
	
	
	// Méthodes
	
	public String displayDate() {
		DateFormat shortDateFormatEN = DateFormat.getDateTimeInstance(
			DateFormat.SHORT,
		    DateFormat.SHORT, new Locale("FR","fr"));
		return shortDateFormatEN.format(getCreatedAt()).toString();
	}
	
	@Override
	public String toString() {
		return "[ Role : " + getClass().getSimpleName() + " ] [ Nom : " + getLastName() + " ] "
				+ "[ Prénom : " + getFirstName() + " ] [ N° client : " + getClientNumber() + " ] "
				+ "[ Adresse : " + getAddress() + " ] [ " + displayDate() + " ]";
	}

}
