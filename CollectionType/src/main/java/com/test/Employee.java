package com.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	
	private Set<Integer> empid;
	private  Map<String, String> coursename;
	private List<Address> address;
	
	
	public Set<Integer> getEmpid() {
		return empid;
	}
	public void setEmpid(Set<Integer> empid) {
		this.empid = empid;
	}
	public Map<String, String> getCoursename() {
		return coursename;
	}
	public void setCoursename(Map<String, String> coursename) {
		this.coursename = coursename;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", coursename=" + coursename + ", address=" + address + "]";
	}
	
	

}
