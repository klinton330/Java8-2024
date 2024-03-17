package com.functionalInterface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);

	}

}

public class FunctionalDemo3 {
	public static void main(String[] args) {
		Consumer<String> consumer = new ConsumerImpl();
		consumer.accept("Hello Consumer");
	}
}
