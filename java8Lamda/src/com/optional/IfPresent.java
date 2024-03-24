package com.optional;

import java.util.Optional;

public class IfPresent {
	public static void main(String[] args) {
		String email1 = "john@gmail.com";

		// Create a optional object
		Optional<String> emailOptional = Optional.of(email1);
		if (emailOptional.isPresent()) {
			System.out.println(emailOptional.get());
		} else {
			System.out.println("No Value is present");
		}
	}
}
