package com.capg.ipl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.BiddingDetails;
import com.capg.ipl.entity.MatchDetails;
import com.capg.ipl.entity.Team;
import com.capg.ipl.repository.BidderRepository;
import com.capg.ipl.repository.BiddingRepository;
import com.capg.ipl.repository.MatchRepository;
import com.capg.ipl.repository.TeamRepository;

@Service
public class BidderServiceImpl implements BidderService{
	
	@Autowired
	private BidderRepository bidderRepo;
	
	@Autowired
	private MatchRepository matchRepo;
	
	@Autowired
	private TeamRepository teamRepo;
	
	@Autowired
	private BiddingRepository biddingRepo;

	@Override
	public Bidder registerBidder(Bidder bidder) {
		// TODO Auto-generated method stub
		Bidder b;
//		if(bidderRepo.findByUserName(bidder.getUsername()).isEmpty()) {
		b = bidderRepo.save(bidder);
//		}
//		else {
//			b=null;
//		}
		return b;
		
	}

	

	@Override
	public String bidderLogin(Bidder bidder) {
		// TODO Auto-generated method stub
		if(bidderRepo.userExist(bidder.getUsername(),bidder.getPassword()).isEmpty()) {
			return "User Does Not Exist";
		}
		else {
			return "Login successful";
		}
	}

	@Override
	public MatchDetails viewMatchDetails(MatchDetails matchDetails) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Team viewTeamDetails(long teamId) {
		// TODO Auto-generated method stub
		return teamRepo.getOne(teamId);
	
	}



	@Override
	public int viewPoints(long bidderId) {
		// TODO Auto-generated method stub
		Bidder bidder = bidderRepo.getOne(bidderId);
		return bidder.getPoints();
	}



	@Override
	public void deleteBid(long biddingId) {
		// TODO Auto-generated method stub
//		BiddingDetails bd = biddingRepo.getOne(biddingId);
//		bidderRepo.delete(bd);
		
	}

}
