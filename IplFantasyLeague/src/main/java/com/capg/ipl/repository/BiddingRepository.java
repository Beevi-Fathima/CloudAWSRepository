package com.capg.ipl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.ipl.entity.BiddingDetails;

@Repository
public interface BiddingRepository extends JpaRepository<BiddingDetails, Long>{

}
