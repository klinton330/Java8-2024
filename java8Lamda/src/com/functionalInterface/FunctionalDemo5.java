package com.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;
//Implemention Supplier Functional Interface in Traditional way
class SupplierImpl implements Supplier<LocalDateTime> {

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}

}

public class FunctionalDemo5 {
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = new SupplierImpl();
		System.out.println(supplier.get());
	}

}
