package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
@Valid
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long addressId;
	@NotBlank (message ="can't be empty")
	@OneToOne
	 @NotBlank
	private User user;
	 @NotBlank
	private String street;
	 @NotBlank
	private String city;
	 @NotBlank
	private String state;
	 @NotBlank
	private String zipcode;

	public Address() {

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return street + ", " + city + ", " + state + " " + zipcode;
	}
}
