package com.capg.ipl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ipl.entity.MatchDetails;

public interface MatchRepository extends JpaRepository<MatchDetails, Long>{

}
