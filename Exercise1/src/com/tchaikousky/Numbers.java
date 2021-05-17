package com.tchaikousky;

public class Numbers {

	public static int numbersToNinetyNine(int number) {
		int sum = 0;
		char x = Integer.toString(number).charAt(0);
		char y = Integer.toString(number).charAt(1);
		char z = Integer.toString(number).charAt(2);
		
		
		sum =  Integer.parseInt(String.valueOf(x)) + Integer.parseInt(String.valueOf(y)) + Integer.parseInt(String.valueOf(z));
		System.out.println(sum);
		return sum;
			
	}
	
	public static String numberAsString(int num) {
		StringBuilder outcome = new StringBuilder();
		
		int firstDigit = num / 100;
		
			switch(firstDigit) {
				case 100:
					outcome.append("one hundred");
				case 200:
					outcome.append("two hundred");
				case 300:
					outcome.append("three hundred");
				case 400:
					outcome.append("four hundred");
				case 500:
					outcome.append("five hundred");
				case 600:
					outcome.append("six hundred");
				case 700:
					outcome.append("seven hundred");
				case 800:
					outcome.append("eight hundred");
				case 900:
					outcome.append("nine hundred");
			}
		
		return " ";
	}
	
	public static void main(String[] args) {
		numbersToNinetyNine(534);
	}
}
