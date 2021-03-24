package com.group100.VotingApp.service;

import java.util.Date;

public interface UserService {
	
	boolean isEighteen(Date dob);
	boolean uniqueUsername(String username);
	boolean passwordRequirementsMet(String password);
	boolean isValid(String username, String password);
}
