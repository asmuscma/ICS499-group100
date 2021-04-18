package com.group100.VotingApp.data.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class User extends Person {
	@OneToOne(cascade = { CascadeType.ALL })
	@Valid
	private Address address;
	 @NotBlank(message = "can't be empty")
	@Column(unique = true)
	 @NotNull
	 @NotBlank
	private String username;
	 @NotNull
	 @NotBlank
	private String password;
	 @NotNull
	 @NotBlank
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;

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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {

		this.dob = dob;
	}
}
