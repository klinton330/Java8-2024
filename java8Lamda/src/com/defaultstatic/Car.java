package com.defaultstatic;

public class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "BMW Brand";
	}

	@Override
	public String speedUp() {
		return "Car speedup";
	}

	@Override
	public String slowDown() {
		return "car slow down";
	}

}
