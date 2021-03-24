package com.group100.VotingApp.serviceImp;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.group100.VotingApp.service.UserService;

public class UserServiceImp implements UserService {

	@Override
	public boolean isEighteen(Date dob) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean uniqueUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passwordRequirementsMet(String password) {
		Pattern letter = Pattern.compile("[a-zA-z]");
		Pattern number = Pattern.compile("[0-9]");
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
		Matcher hasLetter = letter.matcher(password);
		Matcher hasNumber = number.matcher(password);
		Matcher hasSpecial = special.matcher(password);
		
		if(password.length() > 8 && hasLetter.find() && hasNumber.find() && hasSpecial.find()) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isValid(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
