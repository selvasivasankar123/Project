package com.project.RfQ.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class RFQTest {


     RFQ rfq = new RFQ();
	
	@Test
	void testGetRfqid() {
		
		rfq.setRfqid(1L);
		assertEquals(1L, rfq.getRfqid());
	}

	@Test
	void testGetPlantid() {
		
		rfq.setPlantid(1L);
		assertEquals(1L, rfq.getPlantid());
	}

	@Test
	void testGetDemandid() {
		
		rfq.setDemandid(1L);
		assertEquals(1L, rfq.getDemandid());
	}

	@Test
	void testGetReorderid() {
		
		rfq.setReorderid(1L);
		assertEquals(1L, rfq.getReorderid());
	}

	@Test
	void testGetPartid() {
		rfq.setPartid(1L);
		assertEquals(1L, rfq.getPartid());
	}

	@Test
	void testGetPartname() {
		rfq.setPartname("copper");
		assertEquals("copper", rfq.getPartname());
	}

	@Test
	void testGetReorderquantity() {
		
		rfq.setReorderquantity(1L);
		assertEquals(1L, rfq.getReorderquantity());
	}

	@Test
	void testGetReorderrequeststatus() {
		
		rfq.setReorderrequeststatus(true);
		assertEquals(true, rfq.getReorderrequeststatus());
	}

	@Test
	void testGetReorderrequestdate() {
		
		rfq.setReorderrequestdate(new Date(2021,07,01));
		assertEquals(new Date(2021,07,01), rfq.getReorderrequestdate());
	}

	@Test
	void testGetReorderexpecteddate() {
		
		rfq.setReorderexpecteddate(new Date(2021,07,01));
		assertEquals(new Date(2021,07,01), rfq.getReorderexpecteddate());
	}

	@Test
	void testRFQ() {
	  
		assertEquals(rfq,rfq);
	}

}
