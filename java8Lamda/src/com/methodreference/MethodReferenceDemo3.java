package com.methodreference;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReferenceDemo3 {
	// Reference to the instance method of an arbitary object
	// sometimes, we call a method of argument in the lamda expression
	// In that case, we can use a method reference to call an instance
	// Method of an arbitary object of a specific type
	public static void main(String[] args) {

		//Example 1
		// Lamda
		Function<String, String> stringFunction = (input) -> input.toUpperCase();
		System.out.println(stringFunction.apply("this is java 8"));
		
		//Method Reference
		Function<String, String> stringFunction1=String::toUpperCase;
		System.out.println(stringFunction.apply("this is java 8 from method Reference"));
		
	   String [] strArray= {"A","E","I","O","U","a","e","i","o","u"};
	   
	   //Using Lamda
	   Arrays.sort(strArray,(s1,s2)->s1.compareToIgnoreCase(s2));
	   
	   //Using Method Reference
	   Arrays.sort(strArray,String::compareToIgnoreCase);
	   
	   String str="K,li,n,t,o,n";
	  //Cannot make a static reference to the non-static method split(String) from the type String
	  Function<String, String[]>s2=String::split;
	  String s3[]= s2.apply(",");
	  
	  //To Overcome above Error
	  
	  Function<String, String[]>lamS2=(s)->s.split(",");
	  lamS2.apply(str);
		
	}
	
	
}
