package com.group100.VotingApp.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User extends Person {
	@Column(name="address")
	Address address;
	@Column(name="username")
	String username;
	@Column(name="password")
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
