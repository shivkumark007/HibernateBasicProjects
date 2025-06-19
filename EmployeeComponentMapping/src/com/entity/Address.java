package com.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String landMark;
	private String city;
	private int pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String landMark, String city, int pinCode) {
		super();
		this.landMark = landMark;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
}
