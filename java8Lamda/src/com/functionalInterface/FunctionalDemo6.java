package com.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;
//Implemention Supplier Functional Interface using Lamda

public class FunctionalDemo6 {
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier =()->LocalDateTime.now();
		System.out.println(supplier.get());
	}

}
