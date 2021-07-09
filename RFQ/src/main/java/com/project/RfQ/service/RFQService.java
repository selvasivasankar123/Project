package com.project.RfQ.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.RfQ.dao.RFQRepo;
import com.project.RfQ.dto.Plant_Reorder_Details;
import com.project.RfQ.dto.Supplier;
import com.project.RfQ.dto.SupplierPartJoin;

import com.project.RfQ.dto.Supplierpart;
import com.project.RfQ.model.RFQ;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RFQService {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	RFQRepo rfqRepo;

	public List<RFQ> getrfqofplant(List<Plant_Reorder_Details> plant_Reorder_Details2, Long plantid) {

		for (int i = 0; i < plant_Reorder_Details2.size(); i++) {
			RFQ rfq = new RFQ();

			rfq.setDemandid(plant_Reorder_Details2.get(i).getDemandid());
			rfq.setPlantid(plant_Reorder_Details2.get(i).getPlantid());
			rfq.setReorderid(plant_Reorder_Details2.get(i).getReorderid());
			rfq.setPartid(plant_Reorder_Details2.get(i).getPartid());
			rfq.setPartname(plant_Reorder_Details2.get(i).getPartname());
			rfq.setReorderquantity(plant_Reorder_Details2.get(i).getReorderquantity());
			rfq.setReorderrequeststatus(plant_Reorder_Details2.get(i).getReorderrequeststatus());
			rfq.setReorderrequestdate(plant_Reorder_Details2.get(i).getReorderrequestdate());
			rfq.setReorderexpecteddate(plant_Reorder_Details2.get(i).getReorderexpecteddateDate());

			rfqRepo.save(rfq);

		}

		List<RFQ> rfqlist = rfqRepo.findByidp(plantid);
		log.trace("RFQ for the given PlantID are fetched");
		return rfqlist;
	}

	public SupplierPartJoin getpotentialvendors(SupplierPartJoin supplierPartJoins) {

		List<Supplier> suppliers = new ArrayList<Supplier>();
		List<Supplierpart> supplierparts = new ArrayList<Supplierpart>();

		for (int i = 0; i < supplierPartJoins.getSuppliers().size(); i++) {
			Long aLong = supplierPartJoins.getSuppliers().get(i).getSfeedback();
			if (aLong > 7) {
				suppliers.add(supplierPartJoins.getSuppliers().get(i));
				supplierparts.add(supplierPartJoins.getSupplierparts().get(i));
			}
		}
		supplierPartJoins.setSuppliers(suppliers);
		supplierPartJoins.setSupplierparts(supplierparts);
		log.trace("Potential Suppliers are Fetched");
		return supplierPartJoins;

	}
}
