package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Race;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.RaceRepository;
import com.group100.VotingApp.data.repository.UserRepository;

@RestController
@RequestMapping("/Race")
public class RaceController {

	@Autowired 
	private RaceRepository raceRepo;
	
	@GetMapping("/all")
	public List<Race> list(){
		return raceRepo.findAll();
	}
	
	public Race get(@PathVariable Long id) {
		return raceRepo.getOne(id);
	}
	
	@PostMapping
	public Race create(@RequestBody final Race race) {
		return raceRepo.saveAndFlush(race);
		}
}
