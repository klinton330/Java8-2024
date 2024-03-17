package com.methodreference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

///Reference to a constructor
public class MethodReference4 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Watermelon");
		fruits.add("Mango");
		// Using Lamda
		Function<List<String>, HashSet<String>> tohashLamd = (list) -> new HashSet(list);
		System.out.println(tohashLamd.apply(fruits));

		// Using Method Reference
		Function<List<String>, HashSet<String>> tohashmr = HashSet::new;
		System.out.println(tohashmr.apply(fruits));
	}

}
