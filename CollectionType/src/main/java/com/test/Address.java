package com.test;

public class Address {
	
	private int streetNo;
	private String distName;
	private String cityName;
	private String stateName;
	
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", distName=" + distName + ", cityName=" + cityName + ", stateName="
				+ stateName + "]";
	}
	

}
