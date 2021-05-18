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
		int secondDigit = (num - (firstDigit * 100)) / 10;
		System.out.println(secondDigit);
		int thirdDigit = num % 10;
		
			switch(firstDigit) {
				case 1:
					outcome.append("one hundred");
					break;
				case 2:
					outcome.append("two hundred");
					break;
				case 3:
					outcome.append("three hundred");
					break;
				case 4:
					outcome.append("four hundred");
					break;
				case 5:
					outcome.append("five hundred");
					break;
				case 6:
					outcome.append("six hundred");
					break;
				case 7:
					outcome.append("seven hundred");
					break;
				case 8:
					outcome.append("eight hundred");
					break;
				case 9:
					outcome.append("nine hundred");
					break;
				default:
					
			}
			
			switch(secondDigit) {
			case 1:
				if(thirdDigit == 0) {
					outcome.append("ten");
					break;
				} else {
					switch(thirdDigit) {
					case 1:
						outcome.append(" eleven");
						break;
					case 2:
						outcome.append(" twelve");
						break;
					case 3:
						outcome.append(" thirteen");
						break;
					case 4:
						outcome.append(" fourteen");
						break;
					case 5:
						outcome.append(" fifteen");
						break;
					case 6:
						outcome.append(" sixteen");
						break;
					case 7:
						outcome.append(" seventeen");
						break;
					case 8:
						outcome.append(" eighteen");
						break;
					case 9:
						outcome.append(" nineteen");
						break;
					}
				break;
					
				}
			case 2:
				outcome.append(" twenty ");
				break;
			case 3:
				outcome.append(" thirty ");
				break;
			case 4:
				outcome.append(" fourty ");
				break;
			case 5:
				outcome.append(" fifty ");
				break;
			case 6:
				outcome.append(" sixty ");
				break;
			case 7:
				outcome.append(" seventy ");
				break;
			case 8:
				outcome.append(" eighty ");
				break;
			case 9:
				outcome.append(" ninety ");
				break;
		}
			if(secondDigit != 1) {
				switch(thirdDigit) {
				case 1:
					outcome.append("one");
					break;
				case 2:
					outcome.append("two");
					break;
				case 3:
					outcome.append("three");
					break;
				case 4:
					outcome.append("four");
					break;
				case 5:
					outcome.append("five");
					break;
				case 6:
					outcome.append("six");
					break;
				case 7:
					outcome.append("seven");
					break;
				case 8:
					outcome.append("eight");
					break;
				case 9:
					outcome.append("nine");
					break;
				}
			}

			
			System.out.println(outcome);
		
		return outcome.toString();
	}
	
	public static void main(String[] args) {
		numbersToNinetyNine(534);
		System.out.println(numberAsString(435));
		System.out.println(156%10);
	}
}
