package com.test.SpringWithAnnotations;

import org.springframework.stereotype.Component;

@Component("ram")
public class Address {
	
	private String city, state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Address [city=" + city + ", state=" + state + "]";
	}


	

	

}
