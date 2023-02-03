package com.capg.ipl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.Team;
import com.capg.ipl.service.BidderService;

@RestController
public class BidderController {
	
	@Autowired
	private BidderService bidderService;
	
	@PostMapping("/bidder")
	public Bidder registerBidder(@RequestBody Bidder bidder) {
		return this.bidderService.registerBidder(bidder);
	}
	
	
	
	@PostMapping("/login")
	public void loginDetails(Bidder bidder) {
		this.bidderService.bidderLogin(bidder);
	}
	
	@GetMapping("/login")
	public String bidderLogin(Bidder bidder) {
		return this.bidderService.bidderLogin(bidder);
	}
	
	@PostMapping("/team/{teamId}")
	public Team viewTeamDetails(@PathVariable long teamId) {
		return this.bidderService.viewTeamDetails(teamId);
	}

}
