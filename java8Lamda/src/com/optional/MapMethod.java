package com.optional;

import java.util.Optional;

public class MapMethod {
	public static void main(String[] args) {
		String email = "   abc@gmail.com  ";
		Optional<String> optional = Optional.of(email);
		optional.filter((s) -> s.contains("abc")).map(String::trim).ifPresent((s) -> System.out.println(s));
	}

}
