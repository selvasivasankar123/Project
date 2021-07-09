package com.project.RfQ.dto;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class SupplierPartJoin {

	private List<Supplier> suppliers;
	private List<Supplierpart> supplierparts;

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public List<Supplierpart> getSupplierparts() {
		return supplierparts;
	}

	public void setSupplierparts(List<Supplierpart> supplierparts) {
		this.supplierparts = supplierparts;
	}

	public SupplierPartJoin(List<Supplier> suppliers, List<Supplierpart> supplierparts) {
		super();
		this.suppliers = suppliers;
		this.supplierparts = supplierparts;
	}

	public SupplierPartJoin() {
		super();
	}
}
