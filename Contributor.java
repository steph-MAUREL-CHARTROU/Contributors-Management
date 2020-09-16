package com.doandgo.contributorsManagment.model;

public class Contributor {
	
	int id;
	String firstName;
	String lastName;
	int age;
	String gender;
	Address adrs;
	Society sct;
	Function fct;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	public Society getSct() {
		return sct;
	}
	public void setSct(Society sct) {
		this.sct = sct;
	}
	public Function getFct() {
		return fct;
	}
	public void setFct(Function fct) {
		this.fct = fct;
	}
		
}
