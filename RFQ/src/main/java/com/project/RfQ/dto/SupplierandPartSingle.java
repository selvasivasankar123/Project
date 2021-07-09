package com.project.RfQ.dto;

import org.springframework.stereotype.Component;

@Component
public class SupplierandPartSingle {
	
	private Supplier supplier;
	private Supplierpart supplierpart;
	public SupplierandPartSingle(Supplier supplier, Supplierpart supplierpart) {
		super();
		this.supplier = supplier;
		this.supplierpart = supplierpart;
	}
	public SupplierandPartSingle() {
		super();
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Supplierpart getSupplierpart() {
		return supplierpart;
	}
	public void setSupplierpart(Supplierpart supplierpart) {
		this.supplierpart = supplierpart;
	}
}
