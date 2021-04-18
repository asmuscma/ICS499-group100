package com.group100.VotingApp.serviceImp;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.UserRepository;
import com.group100.VotingApp.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean isEighteen(LocalDate dob) {
		Period age = Period.between(dob, LocalDate.now());

		if (age.getYears() >= 18) {
			return true;
		}

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

		if (password.length() >= 8 && hasLetter.find() && hasNumber.find() && hasSpecial.find()) {
			return true;
		}

		return false;
	}

	@Override
	public boolean isValid(String username, String password) {
		if(userRepo.findByUsernameAndPassword(username, password)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void encodePassword(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
	}
	
	@Override
	public void register(User user) {
		if(passwordRequirementsMet(user.getPassword())) {
			if(isEighteen(user.getDob())) {
				encodePassword(user);
				userRepo.save(user);
			}
		}
	}

}
