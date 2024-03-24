package com.defaultstatic;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle=new Car();
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.slowDown());
		System.out.println(vehicle.speedUp());
		System.out.println(Vehicle.getCompany());
	}

}
