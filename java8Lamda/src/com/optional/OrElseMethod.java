package com.optional;

import java.util.Optional;

public class OrElseMethod {
	public static void main(String[] args) {
		String email1 = null;
		// Create a optional object
		Optional<String> emailOptional = Optional.ofNullable(email1);
		String defaultValue = emailOptional.orElse("default@gmail.com");
		System.out.println(defaultValue);
	}

}
