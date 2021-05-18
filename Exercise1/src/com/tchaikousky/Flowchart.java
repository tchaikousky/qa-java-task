package com.tchaikousky;

public class Flowchart {
	public static void main(String[] args) {
		int a = 100;
		while(a <= 200) {
			if(a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			a++;			
		}
		
		printNumbers();
		printSelfByValue();
	}
	
	public static void printNumbers() {
		int a = 1;
		
		while(a <= 10) {

			for(int i = 1; i <= 10; i++) {
				System.out.print(a);
			}
			System.out.println("\n");
			a++;
		}
	}
	
	public static void printSelfByValue() {
		int a = 1;
		while(a <= 10) {
			for(int i = 0; i < a; i++) {
				System.out.print(a);
			}
			a++;
			System.out.println("\n");
		}
	}
}
