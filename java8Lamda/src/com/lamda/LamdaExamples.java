package com.lamda;

public class LamdaExamples {

	public static void main(String[] args) {
		// Runnable Interface with Lamda
		Thread th = new Thread(() -> System.out.println("Run method from lamda"));
		th.run();
	}

}

/*
 * class MyThread implements Runnable {
 * 
 * @Override public void run() { System.out.println("Run method");
 * 
 * }
 * 
 * }
 */