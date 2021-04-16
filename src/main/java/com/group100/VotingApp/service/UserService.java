package com.group100.VotingApp.service;

import java.time.LocalDate;

import com.group100.VotingApp.data.entity.User;

public interface UserService {
	
	boolean isEighteen(LocalDate dob);
	boolean passwordRequirementsMet(String password);
	boolean isValid(String username, String password);
	void encodePassword(User user);
	void register(User user);
}
