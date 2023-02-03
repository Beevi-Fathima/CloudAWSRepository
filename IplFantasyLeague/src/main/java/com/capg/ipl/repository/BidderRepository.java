package com.capg.ipl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.ipl.entity.Bidder;
import com.capg.ipl.entity.BiddingDetails;

@Repository
public interface BidderRepository extends JpaRepository<Bidder, Long>{
	
	@Query("select b from Bidder b where b.username =  userName")
    public List<Bidder> findByUserName(@Param(value ="userName") String userName);
	@Query("select b from Bidder b where b.username=userName and b.password=password")
	public List<Bidder> userExist(@Param(value ="username") String userName,@Param(value="password") String password);
	//public void delete(BiddingDetails bd);
//     
//	@Query("select bidder_name from Bidder")
//    public List<String> getBidders();
}
