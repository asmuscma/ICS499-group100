package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Address;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.AddressRepository;
import com.group100.VotingApp.data.repository.UserRepository;
import com.group100.VotingApp.serviceImp.UserServiceImp;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired 
	private UserRepository userRepo;
	
	@Autowired 
	private AddressRepository addressRepo;
	
	@Autowired
	private UserServiceImp userServiceImp;
	
	@GetMapping("/all")
	public List<User> list(){
		return userRepo.findAll();
	}
	
	@GetMapping("/student/{id}")
	public User get(@PathVariable Long id) {
		return userRepo.getOne(id);
	}
	
	@PostMapping("/add")
	public User create(@RequestBody final User user) {
		if(!userServiceImp.passwordRequirementsMet(user.getPassword())) {
			return null; //Return HTTP error response.
		}
		if(!userServiceImp.isEighteen(user.getDob())) {
			return null; //Return HTTP error response.
		}
		Address address = user.getAddress();
		addressRepo.saveAndFlush(address);
		user.setAddress(address);
		return userRepo.saveAndFlush(user);
		}
}
