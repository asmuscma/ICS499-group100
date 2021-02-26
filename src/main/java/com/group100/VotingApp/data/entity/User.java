package com.group100.VotingApp.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User extends Person {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long userId;
	@Column(name="ADDRESS")
	Address address;
	@Column(name="USERNAME")
	String username;
	@Column(name="PASSWORD")
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
