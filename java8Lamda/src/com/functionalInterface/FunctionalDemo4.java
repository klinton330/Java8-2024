package com.functionalInterface;

import java.util.function.Consumer;

public class FunctionalDemo4 {
	public static void main(String[] args) {
		Consumer<String> consumer = (s)->System.out.println(s);
		consumer.accept("Hello consumer from Lamda");
		
	}
}
