package com.capg.ipl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ipl.entity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long>{

}
