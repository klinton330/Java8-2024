package com.methodreference;

@FunctionalInterface
interface Printable {
	public void print(String msg);
}


public class MethodReferenceDemo {

	public void display(String text) {
		text = text.toUpperCase();
		System.out.println(text);
	}
//Reference to an instance method of a particular Object
	public static void main(String[] args) {
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		// USING LAMDA
		Printable printable = (msg) -> methodReferenceDemo.display(msg);
		printable.print("hello");

		// USING METHOD REFERENCE
		Printable printable1 = methodReferenceDemo::display;
		printable1.print("for Method Reference");

	}

}
