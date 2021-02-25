package com.group100.VotingApp.data.entity;

public abstract class Person {
	
	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	String fName;
	String lName;
	
}
