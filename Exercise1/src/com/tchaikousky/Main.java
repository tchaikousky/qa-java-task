package com.tchaikousky;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate prishDate = LocalDate.parse("2020-10-15");
		Person jim = new Person("Jim", 23, "M");
		Book prish = new Book("The Prish: Unraveled", "Porrcia Thomas", 321, prishDate);
		
		jim.read(prish);
	}
}
