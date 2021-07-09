package com.project.RfQ.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.RfQ.dao.RFQRepo;
import com.project.RfQ.dto.Plant_Reorder_Details;
import com.project.RfQ.dto.SupplierPartJoin;
import com.project.RfQ.model.RFQ;
import com.project.RfQ.service.RFQService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RFQController {
	@Autowired 
	RFQService rfqService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	RFQRepo rfqRepo;
	
	
	@GetMapping("/getRFQOfPlant/{plantid}")
	public List <RFQ> getrfqofplant(@PathVariable Long plantid) {
		
		log.trace("Getting the Reorder details of the parts based on the Plant ID");
		Plant_Reorder_Details[] plant_Reorder_Details = restTemplate.getForObject("http://localhost:8081/viewPartsReOrder", Plant_Reorder_Details[].class);
		List<Plant_Reorder_Details> plant_Reorder_Details2 = Arrays.asList(plant_Reorder_Details);
	 return	rfqService.getrfqofplant(plant_Reorder_Details2,plantid);
	}
	
	@GetMapping("/getPotentialVendorsOfRFQ/{rfqid}")
	public SupplierPartJoin getPotentialvendors(@PathVariable Long rfqid) {
		
		RFQ rfq = rfqRepo.getById(rfqid);
		Long partidLong = rfq.getPartid();
		log.trace("Getting Potential Suppliers for given RFQ ID");
		SupplierPartJoin supplierPartJoins = restTemplate.getForObject("http://localhost:8085/getSupplierOfPart/" + partidLong, SupplierPartJoin.class);	
		 return rfqService.getpotentialvendors(supplierPartJoins);
	}
}
