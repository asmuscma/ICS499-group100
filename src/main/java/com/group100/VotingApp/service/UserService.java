package com.group100.VotingApp.service;

import java.time.LocalDate;

public interface UserService {
	
	boolean isEighteen(LocalDate dob);
	boolean uniqueUsername(String username);
	boolean passwordRequirementsMet(String password);
	boolean isValid(String username, String password);
}
