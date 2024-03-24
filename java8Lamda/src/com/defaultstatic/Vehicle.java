package com.defaultstatic;

public interface Vehicle {

	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlermOn() {
		return "turning vehicle alerm On";
	}

	default String turnAlermOff() {
		return "turning vehicle alerm Off";
	}
	
	static String getCompany() {
		return "BMW";
	}

}
