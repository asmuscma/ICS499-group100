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
import com.group100.VotingApp.data.repository.AddressRepository;

@RestController
@RequestMapping("/addresses")
public class AddressController {

	@Autowired
	private AddressRepository addressRepo;

	@GetMapping("/all")
	public List<Address> list() {
		return addressRepo.findAll();
	}

	@GetMapping("/address/{id}")
	public Address get(@PathVariable Long id) {
		return addressRepo.getOne(id);
	}

	@PostMapping("/add")
	public Address create(@RequestBody final Address address) {
		return addressRepo.saveAndFlush(address);
	}
}
