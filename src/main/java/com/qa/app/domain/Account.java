package com.qa.app.domain;

public class Account {
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public Account(String createdFirstName, String createdLastName, String createdAccoutNum) {
		super();
		this.firstName = createdFirstName;
		this.lastName = createdLastName;
		this.accountNumber = createdAccoutNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
