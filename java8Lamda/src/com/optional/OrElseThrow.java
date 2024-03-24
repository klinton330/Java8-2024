package com.optional;

import java.util.Optional;

public class OrElseThrow {
	
	public static void main(String[] args) {
		String email1 = "kl";
		// Create a optional object
		Optional<String> emailOptional = Optional.ofNullable(email1);
		String email=emailOptional.orElseThrow(()->new NullPointerException("Null Pointer exception"));
		System.out.println(email);
	}

}
