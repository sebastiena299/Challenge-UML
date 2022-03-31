package fr.fms.entities;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Operation {
	
	//Attributes
	
	private int accountNumber;
	private int clientNumber;
	private Date createdAt;
	private String description;
	
	//Constructors
	
	public Operation(int accountNumber, int clientNumber, String description) {
		this.accountNumber = accountNumber;
		this.clientNumber = clientNumber;
		this.description = description;
		setCreatedAt(new Date());
	}
	
	//Methods

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String displayDate() {
		DateFormat shortDateFormatEN = DateFormat.getDateTimeInstance(
			DateFormat.SHORT,
		    DateFormat.SHORT, new Locale("FR","fr"));
		return shortDateFormatEN.format(getCreatedAt()).toString();
	}
	
	public String toString() {
		return " Numéro de compte : " + this.accountNumber + " ; Numéro de client : " + this.clientNumber
				+ " ; Date : " + this.displayDate() + " ; " + description;
	}

}
