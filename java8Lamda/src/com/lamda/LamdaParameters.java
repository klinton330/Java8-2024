package com.lamda;

interface Addable {
	int addition(int a, int b);
}

public class LamdaParameters {

	public static void main(String[] args) {
		Addable addition = (a, b) -> {
			int c;
			c = a + b;
			return c;
		};
		int result = addition.addition(4, 5);
		System.out.println(result);
	}
}
