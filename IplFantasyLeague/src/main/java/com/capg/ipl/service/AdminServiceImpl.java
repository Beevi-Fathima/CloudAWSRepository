package com.capg.ipl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capg.ipl.entity.Admin;
import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.MatchDetails;
import com.capg.ipl.entity.Team;
import com.capg.ipl.entity.Tournament;
import com.capg.ipl.repository.AdminRepository;
import com.capg.ipl.repository.BidderRepository;
import com.capg.ipl.repository.MatchRepository;
import com.capg.ipl.repository.TeamRepository;
import com.capg.ipl.repository.TournamentRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private MatchRepository matchRepo;
	
	@Autowired
	private TeamRepository teamRepo;
	
	@Autowired
	private BidderRepository bidderRepo;
	
	@Autowired
	private TournamentRepository tournamentRepo;

	@Override
	public Admin registerAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);//add
		
	}

	@Override
	public MatchDetails addMatchDetails(MatchDetails matchDetails) {
		// TODO Auto-generated method stub
		return matchRepo.save(matchDetails);
	}

	@Override
	public String updateStatus() {
		// TODO Auto-generated method stub
		MatchDetails md = new MatchDetails();
		return md.getStatus();
	}

	@Override
	public Team setTeam(Team team) {
		// TODO Auto-generated method stub
		return teamRepo.save(team);
	}

	@Override
	public Tournament setTournament(Tournament tournament) {
		// TODO Auto-generated method stub
		return tournamentRepo.save(tournament);
	}
	
	@Override
	public List<String> viewBidders() {
		// TODO Auto-generated method stub
		//return bidderRepo.getBidders();
		return null;
	}

	@Override
	public int updateBidderPointsTable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTeamsPointsTable() {
		// TODO Auto-generated method stub
		return 0;
	}

}
