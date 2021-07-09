package com.project.RfQ.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.RfQ.dto.SupplierPartJoin;
import com.project.RfQ.dao.RFQRepo;
import com.project.RfQ.dto.Plant_Reorder_Details;
import com.project.RfQ.dto.Supplier;
import com.project.RfQ.dto.Supplierpart;
import com.project.RfQ.model.RFQ;


@RunWith(SpringRunner.class)
@SpringBootTest
class RFQServiceTest {
	
	@MockBean
	RFQRepo rfqRepo;
	
	@Autowired
	RFQService rfqService;
	

	@Test
	void testGetrfqofplant() {
		
		Date date = new Date(2021,03,31);
		Plant_Reorder_Details[] plant_Reorder_Details = new Plant_Reorder_Details[1];
		plant_Reorder_Details[0] = new Plant_Reorder_Details(1L,1L,1L,"Copper", 22L,true,new Date(2021,03,31),new Date(2021-01-05) ,1L);
		List<Plant_Reorder_Details> plant_Reorder_Details2 = Arrays.asList(plant_Reorder_Details);
		//rfqService.getrfqofplant(plant_Reorder_Details2,1L);
		//RFQ rfq = new RFQ();
		
//		rfq.setDemandid(plant_Reorder_Details2.get(0).getDemandid());
//		rfq.setPlantid(plant_Reorder_Details2.get(0).getPlantid());
//		rfq.setReorderid(plant_Reorder_Details2.get(0).getReorderid());
//		rfq.setPartid(plant_Reorder_Details2.get(0).getPartid());
//		rfq.setPartname(plant_Reorder_Details2.get(0).getPartname());
//		rfq.setReorderquantity(plant_Reorder_Details2.get(0).getReorderquantity());
//		rfq.setReorderrequeststatus(plant_Reorder_Details2.get(0).getReorderrequeststatus());
//		rfq.setReorderrequestdate(plant_Reorder_Details2.get(0).getReorderrequestdate());
//		rfq.setReorderexpecteddate(plant_Reorder_Details2.get(0).getReorderexpecteddateDate());
//
//		verify(rfqRepo,times(1)).save(rfq);
		when(rfqRepo.findByidp(1L)).thenReturn(Stream.of(new RFQ(1L, 1L, 1L, 1L, 1L,"Copper",22L,true,date,date)).collect(Collectors.toList()));
		assertEquals(1L,rfqService.getrfqofplant(plant_Reorder_Details2,1L).get(0).getPlantid());
	}

	@Test
	void testGetpotentialvendors() {
		
		Date date = new Date(2021,03,31);
		List<Supplier> supplier = new ArrayList<Supplier>();
		supplier.add(new Supplier(1L,"swetha","coimbatore",10L, 1L));
		List<Supplierpart> supplierPart = new ArrayList<Supplierpart>();
		supplierPart.add(new Supplierpart(1L,1L,"Swetha","copper","No",10000.2,34L,date));
		//SupplierAndParts supplierAndParts = new SupplierAndParts(supplier,supplierPart);
		SupplierPartJoin supplierPartJoins = new SupplierPartJoin(supplier,supplierPart);
		assertEquals(10L, rfqService.getpotentialvendors(supplierPartJoins).getSuppliers().get(0).getSfeedback()); 
		
		
	}

}
