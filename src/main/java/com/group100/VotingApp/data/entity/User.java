package com.group100.VotingApp.data.entity;

public class User extends Person {
	
	Address address;
	String username;
	String password;

	public User(String fName, String lName, Address address, String username, String password) {
		super(fName, lName);
		this.address = address;
		this.username = username;
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
