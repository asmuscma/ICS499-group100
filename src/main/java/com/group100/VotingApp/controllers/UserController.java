package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.UserRepository;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired 
	private UserRepository userRepo;
	
	@GetMapping("/all")
	public List<User> list(){
		return userRepo.findAll();
	}
	public User get(@PathVariable Long id) {
		return userRepo.getOne(id);
	}
	
	@PostMapping
	public User create(@RequestBody final User user) {
		return userRepo.saveAndFlush(user);
		}
}
