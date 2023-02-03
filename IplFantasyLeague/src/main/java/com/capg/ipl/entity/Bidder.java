package com.capg.ipl.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="bidder")

public class Bidder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bidder_id")
	private long bidderId;
	
	@Column(name="bidder_name")
	private String bidderName;
	
	@Column(name="username")
	private String username;
	
	
	@Column(name="password")
	private String password;
	
	@Column(name="mobile_no")
	private long mobileNo;
	
	@Column(name="points")
	private int points;
    
	public Bidder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bidder(long bidderId, String username, String password, long mobileNo, int points,String bidderName) {
		super();
		this.bidderId = bidderId;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.points = points;
		this.bidderName = bidderName;
	}

	public String getBidderName() {
		return bidderName;
	}

	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}

	public long getBidderId() {
		return bidderId;
	}

	public void setBidderId(long bidderId) {
		this.bidderId = bidderId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Bidder [bidderId=" + bidderId + ", bidderName=" +bidderName+ ", username=" + username + ", password=" + password + ", mobileNo="
				+ mobileNo + ", points=" + points + "]";
	}
	
	
	
	
	
	
	

}
