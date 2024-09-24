package com.test.AutowiringParactice;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	//@Autowired
	private Address address;
	
	
	
     @Autowired
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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
