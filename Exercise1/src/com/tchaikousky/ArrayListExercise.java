package com.tchaikousky;

import java.util.ArrayList;

public class ArrayListExercise {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("milk");
		myList.add("eggs");
		myList.add("bread");
		myList.add("soda");
		
		System.out.println(myList);
		
		for(int i = 0; i < myList.size() - 1; i++) {
			System.out.println(myList.get(i));
		}
		
		for(String item : myList) {
			System.out.println(item);
		}
		
		myList.get(0);
		myList.set(3, "juice");
		myList.remove(2);
		myList.sort(null);
		System.out.println(myList);
	
	}

}
