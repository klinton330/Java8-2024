package com.functionalInterface;

@FunctionalInterface
public interface FI1 {
	public void print(String name);

	default void m1() {
		System.out.println("Default Method");
	}

	static void m2() {
		System.out.println("static Method");
	}
}
