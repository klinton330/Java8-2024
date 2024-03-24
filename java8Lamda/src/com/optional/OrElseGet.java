package com.optional;

import java.util.Optional;

public class OrElseGet {
	public static void main(String[] args) {
		String email = null;
		Optional<String> emailOptional = Optional.ofNullable(email);
		String result = emailOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(result);
	}
}
