package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.group100.VotingApp.Address;

public class User extends Person {
	
	Address address;
	String username;
	String password;

	@Entity
	@Table(name ="User");
	public User(String fName, String lName, Address address, String username, String password) {
		super(fName, lName);
		this.address = address;
		this.username = username;
		this.password = password;
	}
	
	
}
