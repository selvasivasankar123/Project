package com.project.RfQ.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class RFQ {
	
	@Id
	@GeneratedValue
	private Long rfqid;
	private Long plantid;
	private Long demandid;
	private Long reorderid;
	private Long partid;
	private String partname;
	private Long reorderquantity;
	private Boolean reorderrequeststatus;
	private Date reorderrequestdate;
	private Date reorderexpecteddate;
	public RFQ(Long rfqid, Long plantid, Long demandid, Long reorderid, Long partid, String partname,
			Long reorderquantity, Boolean reorderrequeststatus, Date reorderrequestdate, Date reorderexpecteddate) {
		super();
		this.rfqid = rfqid;
		this.plantid = plantid;
		this.demandid = demandid;
		this.reorderid = reorderid;
		this.partid = partid;
		this.partname = partname;
		this.reorderquantity = reorderquantity;
		this.reorderrequeststatus = reorderrequeststatus;
		this.reorderrequestdate = reorderrequestdate;
		this.reorderexpecteddate = reorderexpecteddate;
	}
	public Long getRfqid() {
		return rfqid;
	}
	public void setRfqid(Long rfqid) {
		this.rfqid = rfqid;
	}
	public Long getPlantid() {
		return plantid;
	}
	public void setPlantid(Long plantid) {
		this.plantid = plantid;
	}
	public Long getDemandid() {
		return demandid;
	}
	public void setDemandid(Long demandid) {
		this.demandid = demandid;
	}
	public Long getReorderid() {
		return reorderid;
	}
	public void setReorderid(Long reorderid) {
		this.reorderid = reorderid;
	}
	public Long getPartid() {
		return partid;
	}
	public void setPartid(Long partid) {
		this.partid = partid;
	}
	public String getPartname() {
		return partname;
	}
	public void setPartname(String partname) {
		this.partname = partname;
	}
	public Long getReorderquantity() {
		return reorderquantity;
	}
	public void setReorderquantity(Long reorderquantity) {
		this.reorderquantity = reorderquantity;
	}
	public Boolean getReorderrequeststatus() {
		return reorderrequeststatus;
	}
	public void setReorderrequeststatus(Boolean reorderrequeststatus) {
		this.reorderrequeststatus = reorderrequeststatus;
	}
	public Date getReorderrequestdate() {
		return reorderrequestdate;
	}
	public void setReorderrequestdate(Date reorderrequestdate) {
		this.reorderrequestdate = reorderrequestdate;
	}
	public Date getReorderexpecteddate() {
		return reorderexpecteddate;
	}
	public void setReorderexpecteddate(Date reorderexpecteddate) {
		this.reorderexpecteddate = reorderexpecteddate;
	}
	public RFQ() {
		super();
	}
	@Override
	public String toString() {
		return "RFQ [rfqid=" + rfqid + ", plantid=" + plantid + ", demandid=" + demandid + ", reorderid=" + reorderid
				+ ", partid=" + partid + ", partname=" + partname + ", reorderquantity=" + reorderquantity
				+ ", reorderrequeststatus=" + reorderrequeststatus + ", reorderrequestdate=" + reorderrequestdate
				+ ", reorderexpecteddate=" + reorderexpecteddate + "]";
	}
	

}
