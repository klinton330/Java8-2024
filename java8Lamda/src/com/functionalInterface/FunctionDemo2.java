package com.functionalInterface;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		Function<String, Integer> function = (s) -> s.length();
		System.out.println(function.apply("klinton"));
	}

}
