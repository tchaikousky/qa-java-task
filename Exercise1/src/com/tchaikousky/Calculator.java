package com.tchaikousky;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(10, 2));
		System.out.println(subtract(10, 2));
		System.out.println(multiply(10, 2));
		divide(2, 10);

	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static void divide(double x, double y) {
		double result = 0;
		if(x <= y) {
			result = y / x;
			System.out.println(result);
		} else {
			System.out.println("This division can not be done.");
		}
	}

}
