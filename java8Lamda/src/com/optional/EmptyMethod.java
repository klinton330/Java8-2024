package com.optional;

import java.util.Optional;

public class EmptyMethod {

	public static void main(String[] args) {
		// empty() method returns empty optional Class
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional); // Optional.empty
	}

}
