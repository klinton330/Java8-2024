package com.lamda;

//Functional Interface
interface Shape {
	void draw();
}

//Implementing Lamda 
public class Lamda1 {
	public static void main(String[] args) {
		print(() -> System.out.println("From Square"));
		print(() -> System.out.println("From Rectangle"));
		print(() -> System.out.println("From Triangle"));

	}
    //Lamda Expression as parameters
	public static void print(Shape shape) {
		shape.draw();
	}
}
