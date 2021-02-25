package com.group100.VotingApp.data.entity;

public abstract class Person {
	
	public Person(String fName, String lName, long personId) {
		this.fName = fName;
		this.lName = lName;
		this.personId = personId;
	}
	
	String fName;
	String lName;
	long personId;
	
}
