package com.doandgo.contributorsManagment.model;

import java.util.Date;

public abstract class Function {
	
	int coeff;
	int nbrHours;
	int salary;
	Date startDate;
	Date endDate;
	
	public int getCoeff() {
		return coeff;
	}
	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}
	public int getNbrHours() {
		return nbrHours;
	}
	public void setNbrHours(int nbrHours) {
		this.nbrHours = nbrHours;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
