package com.optional;

import java.util.Optional;

public class Filter {

	public static void main(String[] args) {
		String email = "abc@gmail.com";
		Optional<String> optional = Optional.of(email);
		optional.filter((s) -> s.contains("abc")).ifPresent((s) -> System.out.println(s));
	}

}
