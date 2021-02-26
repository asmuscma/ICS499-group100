package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Person {
	@Id
	@Column(name = "fName")
	private String fName;
	@Column(name = "lName")
	private String lName;

	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}