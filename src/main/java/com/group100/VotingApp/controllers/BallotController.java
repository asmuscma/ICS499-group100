package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.serviceImp.BallotServiceImp;

@RestController
@RequestMapping("/ballot")
public class BallotController {

	@Autowired
	private BallotRepository ballotRepo;

	@Autowired
	private BallotServiceImp ballotServiceImp;

	@GetMapping("/all")
	public List<Ballot> list() {

		return ballotRepo.findAll();
	}

	@GetMapping("/issue/{id}")
	public Ballot get(@PathVariable Long id) {
		return ballotRepo.getOne(id);
	}

	@PostMapping("/add")
	public Ballot create(@RequestBody final Ballot ballot) {
<<<<<<< Updated upstream
		if(!ballotServiceImp.checkIfVoted(ballot.getUser())) {
=======
		if (!ballotServiceImp.checkIfVoted(ballot.getUser().getUsername())) {
>>>>>>> Stashed changes
			return ballotRepo.saveAndFlush(ballot);
		}
		return null;
	}

	@GetMapping("/makeballot")
	public String getBallot(Model model) {
		model.addAttribute("ballot", new Ballot());
		return "ballot";
	}

	@PostMapping("/makeballot")
	public String ballotForm(@ModelAttribute("Ballot") Ballot ballot, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println("Did not bind");
			return "/";
		}
		model.addAttribute("Ballot", ballot);
		return "ballot";
	}
}
