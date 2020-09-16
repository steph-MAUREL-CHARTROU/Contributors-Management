package com.doandgo.contributorsManagment.model;

public class Society {
	
	int id;
	String name;
	String corporateName;
	int siret;
	Address adrs;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public int getSiret() {
		return siret;
	}
	public void setSiret(int siret) {
		this.siret = siret;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

}
