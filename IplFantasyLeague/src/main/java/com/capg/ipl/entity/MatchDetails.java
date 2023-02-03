package com.capg.ipl.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set.*;

import javax.persistence.*;



@Entity
@Table(name="match_details")
public class MatchDetails {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="match_id")
	   private int matchId;
	   
	   @OneToOne
	   @JoinColumn(name="team_id")
	   private Team team;
	   
	   @Column(name="date")
	   public LocalDate date;
	   
	   @Column(name="start_time")
	   private LocalTime startTime;
	   
	   @Column(name="end_time")
	   private LocalTime endTime;
	   
	   @Column(name="place")
	   private String place;
	   
	   @Column(name="status")
	   private String status;
	   
	   @Column(name="result")
	   private String result;

	public MatchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MatchDetails(int matchId, Team teamOne, Team teamTwo, LocalDate date, LocalTime startTime, LocalTime endTime,
			String place,String status,String result) {
		super();
		this.matchId = matchId;
		this.team = team;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.place = place;
		this.status = status;
		this.result = result;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "MatchDetails [matchId=" + matchId + ", team=" + team + ", date=" + date
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", place=" + place + ", status=" + ",result=" + "]";
	}
	   
	
	   
}
