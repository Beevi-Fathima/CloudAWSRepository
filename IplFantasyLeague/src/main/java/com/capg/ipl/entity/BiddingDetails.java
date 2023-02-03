package com.capg.ipl.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="bidding_details")
public class BiddingDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bidding_id")
	private int biddingId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bidder_id")
	private Bidder bidder;
	
	@OneToOne
	@JoinColumn(name="matchId")
	private MatchDetails matchDetails;
	
	@OneToOne
	@JoinColumn(name="team")
	private Team team;
	
	public BiddingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	public BiddingDetails(Bidder bidder, MatchDetails matchDetails, Team team) {
		super();
		this.bidder = bidder;
		this.matchDetails = matchDetails;
		this.team = team;
	}
	


	public Bidder getBidderId() {
		return bidder;
	}


	public void setBidderId(Bidder bidder) {
		this.bidder = bidder;
	}


	public MatchDetails getMatchDetails() {
		return matchDetails;
	}


	public void setMatchDetails(MatchDetails matchDetails) {
		this.matchDetails = matchDetails;
	}


	public Team getTeam() {
		return team;
	}


	public void setTeam(Team team) {
		this.team = team;
	}
    

	@Override
	public String toString() {
		return "BiddingDetails [bidderId=" + bidder + ", matchId=" + matchDetails + ", teamId=" + team + "]";
	}
	
	
	

}
