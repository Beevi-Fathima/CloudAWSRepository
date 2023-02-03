package com.capg.ipl.entity;

import javax.persistence.*;

@Entity
@Table(name="team")
public class Team {
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="team_id")
     private long teamId;
     
     @Column(name="teamname")
     private String teamName;
     
     @Column(name="captain")
     private String captain;
     
     @Column(name="matchesplayed")
     private int matchesPlayed;
     
     @Column(name="matcheswon")
     private int matchesWon;
     
     @Column(name="matchesdrawn")
     private int matchesDrawn;
     
     @Column(name="matcheslost")
     private int matchesLost;
     
     @ManyToOne
     @JoinColumn(name="tournament_id",nullable=false)
     private Tournament tournament;
     
     

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(long team_id, String teamname, String captain, int matchesPlayed,int mathcesWon,int matchesLost,int matchesDrawn) {
		super();
		this.teamId = team_id;
		this.teamName = teamname;
		this.captain = captain;
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.matchesDrawn = matchesDrawn;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long team_id) {
		this.teamId = team_id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamname) {
		this.teamName = teamname;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public int getMatchesDrawn() {
		return matchesDrawn;
	}

	public void setMatchesDrawn(int matchesDrawn) {
		this.matchesDrawn = matchesDrawn;
	}

	public int getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", captain=" + captain + ", matchesPlayed="
				+ matchesPlayed + ", matchesWon=" + matchesWon + ", matchesDrawn=" + matchesDrawn + ", matchesLost="
				+ matchesLost + ", tournament=" + tournament + "]";
	}

	
     
    

}
