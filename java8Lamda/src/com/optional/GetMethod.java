package com.optional;

import java.util.Optional;

public class GetMethod {

	public static void main(String[] args) {
		String email1 = "john@gmail.com";

		//Create a optional object
		Optional<String> emailOptional = Optional.of(email1);

		//Returns Object from Optional Object
		String email = emailOptional.get();
		System.out.println(email);
	}

}
