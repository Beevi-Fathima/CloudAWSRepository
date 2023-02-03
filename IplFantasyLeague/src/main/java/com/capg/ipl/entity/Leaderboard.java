package com.capg.ipl.entity;

import javax.persistence.*;

@Entity
@Table(name="leaderboard")
public class Leaderboard {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="bidder_id")
	    private long bidder_id;
	    
	    @Column(name="points")
	    private int points;
	    
	    @Column(name="match_id")
	    private long match_id;
        
	    
		public Leaderboard() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Leaderboard(long bidder_id, int points, long match_id) {
			super();
			this.bidder_id = bidder_id;
			this.points = points;
			this.match_id = match_id;
		}


		public long getBidder_id() {
			return bidder_id;
		}


		public void setBidder_id(long bidder_id) {
			this.bidder_id = bidder_id;
		}


		public int getPoints() {
			return points;
		}


		public void setPoints(int points) {
			this.points = points;
		}


		public long getMatch_id() {
			return match_id;
		}


		public void setMatch_id(long match_id) {
			this.match_id = match_id;
		}


		@Override
		public String toString() {
			return "Leaderboard [bidder_id=" + bidder_id + ", points=" + points + ", match_id=" + match_id + "]";
		}
		
		
	    
	    
}
