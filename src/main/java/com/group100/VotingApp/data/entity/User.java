package com.group100.VotingApp.data.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User extends Person implements UserDetails {
	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = { CascadeType.ALL })
	@Valid
	private Address address;

	@Column(unique = true)
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String role;
	private boolean enabled;

	public User() {

	}
	
	public User(@Valid Address address, @NotEmpty String username, @NotEmpty String password, LocalDate dob,
			String role, boolean enabled) {
		super();
		this.address = address;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.role = role;
		this.enabled = enabled;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		
		list.add(new SimpleGrantedAuthority("ROLE_USER"));
		return list;
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
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
}
