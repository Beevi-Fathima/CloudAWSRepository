package com.capg.ipl.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;


@Entity
@Table(name="tournament")
public class Tournament {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="tournament_id")
	    public int tournament_id;
	    
	    @OneToMany(mappedBy="tournament")
	    private Set<Team> teams = new HashSet<Team>() {{
	    	add(new Team());
	    	add(new Team());
	    	add(new Team());
	    	add(new Team());
	    }};

		public Tournament() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Tournament(int tournament_id, Set<Team> teams) {
			super();
			this.tournament_id = tournament_id;
			this.teams = teams;
		}

		public int getTournament_id() {
			return tournament_id;
		}

		public void setTournament_id(int tournament_id) {
			this.tournament_id = tournament_id;
		}

		public Set<Team> getTeams() {
			return teams;
		}

		public void setTeams(Set<Team> teams) {
			this.teams = teams;
		}

		@Override
		public String toString() {
			return "Tournament [tournament_id=" + tournament_id + ", teams=" + teams + "]";
		}
	    
	    
}
