package com.tchaikousky;

public class ArrayClasses {

	public static void main(String[] args) {
		int[] myIntArray = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			myIntArray[i] = i +1;
		}
		for(int i = 0; i < 10; i++) {
			if(i != myIntArray.length - 1) {
				System.out.print(myIntArray[i] + ", ");
			} else { 
				System.out.println(myIntArray[i]);
			}
		}
		
		int[] secondIntArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		for(int i = 0; i < 10; i++) {
			if(i != myIntArray.length -1) {
				System.out.print(secondIntArray[i] + ", ");
			} else {
				System.out.println(secondIntArray[i]);
			}
			
		}
		for(int i = 0; i < 10; i++) {
			secondIntArray[i] *= 10;
			System.out.println(secondIntArray[i]);
		}
	}
}
