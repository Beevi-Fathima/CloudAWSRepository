package com.capg.ipl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ipl.*;
import com.capg.ipl.entity.Admin;
import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.MatchDetails;
import com.capg.ipl.entity.Team;
import com.capg.ipl.entity.Tournament;
import com.capg.ipl.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	
	@GetMapping("/admin")
	public ResponseEntity<?> setAdmin(Admin admin){
		
		return new ResponseEntity<>("Hello Admin",HttpStatus.OK);
	}
	
	@PostMapping("/admin")
	public Admin registerAdmin(@RequestBody Admin admin) {
		return adminService.registerAdmin(admin);
	}
	
	@PostMapping("/match")
	public MatchDetails addMatchDetails(@RequestBody MatchDetails matchDetails){
		return this.adminService.addMatchDetails(matchDetails);
	}
	
	@PostMapping("/team")
	public Team setTeam(@RequestBody Team team) {
	     return this.adminService.setTeam(team);
	}
	
	@PostMapping("/tournament")
	public Tournament setTournament(@RequestBody Tournament tournament) {
		return this.adminService.setTournament(tournament);
	}
	
	@GetMapping("/bidder")
	public List<String> viewBidders() {
		return this.adminService.viewBidders();
	}
}
