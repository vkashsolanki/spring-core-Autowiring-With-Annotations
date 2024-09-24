package com.test.SpringWithAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@ComponentScan(basePackages = "com.test.SpringWithAnnotations")
@Component("java")
public class Student {
	

	@Autowired
	private Address address;

	
	

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}


	
	
}