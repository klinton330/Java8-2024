package com.functionalInterface;

import java.util.function.Function;

//Implemention predefined Functional Interface
class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}

}

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> function = new FunctionImpl(); // Integer result
		function.apply("Hari"); // System.out.println(result);

	}

}
