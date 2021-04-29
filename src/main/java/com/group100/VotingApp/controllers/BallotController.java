package com.group100.VotingApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.serviceImp.BallotServiceImp;

@Controller
public class BallotController {

	@Autowired
	private BallotRepository ballotRepo;

	@Autowired
	private BallotServiceImp ballotService;

	@GetMapping("/allBallots")
	public List<Ballot> list() {
		return ballotRepo.findAll();
	}

	@GetMapping("/ballot/{id}")
	public Ballot get(@PathVariable Long id) {
		return ballotRepo.getOne(id);
	}

	@PostMapping("/addBallot")
	public Ballot create(@RequestBody final Ballot ballot) {
		if (!ballotService.checkIfVoted(ballot.getUser().getUsername())) {
			return ballotRepo.saveAndFlush(ballot);
		}
		return null;
	}

	@GetMapping("/makeballot00")
	public String ballot00(Model model) {
		return "ballot00";
	}

	@PostMapping("/makeballot00")
	public String sendballot00(@Valid Ballot ballot, Model model) {
		ballotRepo.saveAndFlush(ballot);
		model.addAttribute("ballot", ballot);
		return "ballot01";
	}

	@GetMapping("/makeballot01")
	public String ballot01(Model model) {
		return "ballot01";
	}

	@PostMapping("/makeballot01")
	public String sendballot01(@Valid Ballot ballot, Model model) {
		ballotRepo.saveAndFlush(ballot);
		model.addAttribute("ballot", ballot);
		return "ballot02";
	}

	@GetMapping("/makeballot02")
	public String ballot02(Model model) {
		return "ballot02";
	}

	@PostMapping("/makeballot03")
	public String sendballot03(@Valid Ballot ballot, Model model) {
		ballotRepo.saveAndFlush(ballot);
		model.addAttribute("ballot", ballot);
		return "ballot04";
	}

	@GetMapping("/makeballot04")
	public String ballot04(Model model) {
		return "ballot04";
	}

	@PostMapping("/makeballot04")
	public String sendballot04(@Valid Ballot ballot, Model model) {
		ballotRepo.saveAndFlush(ballot);
		model.addAttribute("ballot", ballot);
		return "BallotResults";
	}

}
