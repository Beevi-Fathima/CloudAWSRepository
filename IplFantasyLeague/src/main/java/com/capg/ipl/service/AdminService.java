package com.capg.ipl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.ipl.entity.Admin;
import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.MatchDetails;
import com.capg.ipl.entity.Team;
import com.capg.ipl.entity.Tournament;

@Service
public interface AdminService {
	
	public Admin registerAdmin(Admin admin);
	public MatchDetails addMatchDetails(MatchDetails matchDetails); //create
	public List<String> viewBidders();                            //read
	public Team setTeam(Team team);
	public String updateStatus();
	public Tournament setTournament(Tournament tournament);
    public int updateBidderPointsTable();
    public int updateTeamsPointsTable();
}
