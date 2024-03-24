package com.optional;

import java.util.Optional;

public class IsPresent {
	public static void main(String[] args) {
		Optional<String>value=Optional.of("Hello");
		Optional<String>noValue=Optional.empty();
		
		value.ifPresent((s)->System.out.println("value is present"));
		noValue.ifPresent((s)->System.out.println("value is not present"));
	}

}
