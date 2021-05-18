package com.tchaikousky;

public class JavaStringsTask {
	public static void main(String[] args) {
		String first = "yesterday it was raining";
		String second = "today it is sunny";
		first.toUpperCase();
		second.toUpperCase();
		String combined = second.concat(", ").toUpperCase().concat(first.toUpperCase());
		System.out.println(combined);
		System.out.println(combined.substring(0, 17));
		
		System.out.println(countWords("Hello my dear"));
		verticalWords("Hello my dear");
		verticalWordsReversed("Hello my dear");
	}
	
	public static int countWords(String words) {
		int count = 0;
		for(int i = 0; i < words.length(); i++) {
			if(words.substring(i, i + 1).equals(" ")) {
				count++;
			}
		}
		//accounts for final word
		count++;
		return count;
	}
	
	public static void verticalWords(String words) {
		String currentWord = " ";
		for(int i = 0; i < words.length(); i++) {
			currentWord = currentWord.concat(words.substring(i, i+1));
			if(words.substring(i, i +1).equals(" ")) {
				System.out.println(currentWord.trim());
				currentWord = "";
			} else if(i == words.length() - 1) {
				System.out.println(currentWord.trim());
			}
		}
	}
	
	public static void verticalWordsReversed(String words) {
		String currentWord = "";
		String currentWordReversed = "";
		

		for(int i = words.length() - 1; i >= 0; i--) {
			if( i == words.length() - 1) {
				currentWord = currentWord.concat(words.substring(i));
			} 
			if(i > 0) {
				currentWord = currentWord.concat(words.substring(i - 1, i));
				if(words.substring(i - 1, i).equals(" ")) {
					for(int j = currentWord.trim().length(); j > 0; j--) {
						currentWordReversed = currentWordReversed.concat(currentWord.substring(j - 1, j));
					}
					System.out.println(currentWordReversed);
					currentWordReversed = "";
					currentWord = "";
				} else if(i == 1) {
					for(int j = currentWord.trim().length(); j > 0; j--) {
						currentWordReversed = currentWordReversed.concat(currentWord.substring(j - 1, j));
					}
					System.out.println(currentWordReversed);
				}
			}
		}
	}
	
	
}
