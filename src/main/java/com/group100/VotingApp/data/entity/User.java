package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

public class User extends Person {

	@Entity
	@Table(name ="User");
	public User(String fName, String lName, long personId) {
		super(fName, lName, personId);
		// TODO Auto-generated constructor stub
	}
	
	
}
