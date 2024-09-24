package com.test.AutowiringParactice;

public class Address {
	
	private int streetNo;
	private String city;
	private String state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Address(int streetNo) {
		super();
		this.streetNo = streetNo;
	}



	public Address(int streetNo, String city) {
		super();
		this.streetNo = streetNo;
		this.city = city;
	}



	public Address(int streetNo, String city, String state) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
