package com.project.RfQ.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.RfQ.model.RFQ;

public interface RFQRepo extends JpaRepository<RFQ, Long>{
	
	@Query("select r from RFQ r where plantid= ?1")
	public RFQ getRfqOfPlant();
		
	@Query(value="select * from rfq where plantid=?1",nativeQuery = true)	
	public List<RFQ> findByidp(long plantid);
}
