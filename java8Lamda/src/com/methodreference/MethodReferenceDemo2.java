package com.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo2 {
	
	public static int addition(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		
		//using Lamda for inbuilt static methods
		Function<Integer, Double>function=(input)->Math.sqrt(input);
		System.out.println(function.apply(4));
		//Using Method Reference for inbuilt static methods
		Function<Integer, Double>methodRefFunction=Math::sqrt;
		System.out.println(methodRefFunction.apply(32));
		
		//using Lamda
		BiFunction<Integer, Integer, Integer>bifunctioLamda=(a,b)->MethodReferenceDemo2.addition(a, b);
		System.out.println(bifunctioLamda.apply(5, 4));
		//Using method Reference
		BiFunction<Integer, Integer, Integer>bifunctionMr=MethodReferenceDemo2::addition;
		System.out.println(bifunctionMr.apply(74, 14));
		//Using method Reference
		BiFunction<Integer, Integer, Integer>sub=MethodReferenceDemo2::sub;
		System.out.println(sub.apply(74, 14));
	}

}
