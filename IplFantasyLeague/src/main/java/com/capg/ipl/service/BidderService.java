package com.capg.ipl.service;

import java.util.List;

import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.BiddingDetails;
import com.capg.ipl.entity.MatchDetails;
import com.capg.ipl.entity.Team;

public interface BidderService {
	public Bidder registerBidder(Bidder bidder); //
	public String bidderLogin(Bidder bidder); //
	public MatchDetails viewMatchDetails(MatchDetails matchDetails);
	public Team viewTeamDetails(long teamId); //
	public int viewPoints(long bidderId);
	public void deleteBid(long biddingId);

}
