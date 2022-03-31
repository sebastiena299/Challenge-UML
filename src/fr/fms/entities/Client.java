package fr.fms.entities;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Client {
	
<<<<<<< HEAD
	// Variables
	
	private int id;
	private int clientNumber;
	private String lastName;
	private String firstName;
	private String address;
	private Date createdAt;
	
	// Constructors
	
	public Client(int id, int clientNumber, String lastName, String firstName, String address) {
		setId(id);
		setClientNumber(clientNumber);
		setLastName(lastName);
		setFirstName(firstName);
		setAddress(address);
		setCreatedAt(new Date());
	}
	
	// Getters & Setters
	
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
	
	// Méthodes
	
	public String displayDate() {
		DateFormat shortDateFormatEN = DateFormat.getDateTimeInstance(
			DateFormat.SHORT,
		    DateFormat.SHORT, new Locale("FR","fr"));
		return shortDateFormatEN.format(getCreatedAt()).toString();
	}
	
	@Override
	public String toString() {
		return "" + displayDate() + "";
	}
=======
	
>>>>>>> 6ca864d4717acb184fd7536ce1edbfd9d8aef2fc

}
