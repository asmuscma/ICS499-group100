package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToOne;

@Entity
@Table(name = "USER")
public class User extends Person {
	@OneToOne(mappedBy = "user")
	private Address address;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;

	public User() {

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
