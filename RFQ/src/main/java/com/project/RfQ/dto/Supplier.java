package com.project.RfQ.dto;

import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Supplier {
	
	private Long sid;
	private String sname;
	private String slocation;
	private Long sfeedback;
	private Long partid;
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSlocation() {
		return slocation;
	}
	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}
	public Long getSfeedback() {
		return sfeedback;
	}
	public void setSfeedback(Long sfeedback) {
		this.sfeedback = sfeedback;
	}
	public Long getPartid() {
		return partid;
	}
	public void setPartid(Long partid) {
		this.partid = partid;
	}
	public Supplier(Long sid, String sname, String slocation, Long sfeedback, Long partid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.slocation = slocation;
		this.sfeedback = sfeedback;
		this.partid = partid;
	}
	public Supplier() {
		super();
	}
}
