package com.optional;

import java.util.Optional;

public class OfNullable {
	public static void main(String[] args) {
		String email1 = "john@gmail.com";

		Optional<String> emailOptional = Optional.ofNullable(email1);
		System.out.println(emailOptional);// Optional[john@gmail.com]

		String email2 = null;
		Optional<String> emailOptional2 = Optional.ofNullable(email2);
     	System.out.println(emailOptional2);//Optional.empty
	}

}
