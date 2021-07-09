package com.project.RfQ.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
public class Supplierpart {

	
	private Long supid;
	private Long partid;
	private String suppliername;
	private String partname;
	private String partspecification;
	private double price;
	private Long quantity;
	private Date expectedsupplydate;
	public Supplierpart(Long supid, Long partid, String suppliername, String partname, String partspecification,
			double price, Long quantity, Date expectedsupplydate) {
		super();
		this.supid = supid;
		this.partid = partid;
		this.suppliername = suppliername;
		this.partname = partname;
		this.partspecification = partspecification;
		this.price = price;
		this.quantity = quantity;
		this.expectedsupplydate = expectedsupplydate;
	}
	public Long getSupid() {
		return supid;
	}
	public void setSupid(Long supid) {
		this.supid = supid;
	}
	public Long getPartid() {
		return partid;
	}
	public void setPartid(Long partid) {
		this.partid = partid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getPartname() {
		return partname;
	}
	public void setPartname(String partname) {
		this.partname = partname;
	}
	public String getPartspecification() {
		return partspecification;
	}
	public void setPartspecification(String partspecification) {
		this.partspecification = partspecification;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Date getExpectedsupplydate() {
		return expectedsupplydate;
	}
	public void setExpectedsupplydate(Date expectedsupplydate) {
		this.expectedsupplydate = expectedsupplydate;
	}
	public Supplierpart() {
		super();
	}
}
