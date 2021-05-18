package com.tchaikousky;

public class EnhancedForLoopExercise {
	public static void main(String[] args) {
		
		stringArray();
		intArray();
		
		int[] myInts = intArray();
		
		for(int num : myInts) {
			if(isEven(num)) {
				System.out.println(num * num * num);
			} else {
				System.out.println(num * num);
			}
		}
		
		
	}
	
	public static void stringArray() {
		String[] strings = {"cat", "dog", "mouse", "horse", "rabbit"};
		
		for(String word : strings) {
			System.out.println(word);
		}
	}
	
	public static int[] intArray() {
		int[] numbers = new int[20];
		int count = 0;
		for(int num : numbers) {
			numbers[count] = count + 1;
			count++;
		}
		for(int num : numbers) {
			System.out.print((num * num) + " ");
		}
		
		return numbers;
	}
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		
		return false;
	}
}
