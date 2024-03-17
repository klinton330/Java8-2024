package com.optional;

import java.util.Optional;

public class OfMethod {
	public static void main(String[] args) {
		// of method -Returns the optional class if value is present. Other wise it will
		// return null pointer exception

		String email1 = "john@gmail.com";

		Optional<String> emailOptional = Optional.of(email1);
		System.out.println(emailOptional);// Optional[john@gmail.com]

		String email2 = null;
		Optional<String> emailOptional2 = Optional.of(email2);
     	System.out.println(emailOptional2);//java.lang.NullPointerException

	}

}
