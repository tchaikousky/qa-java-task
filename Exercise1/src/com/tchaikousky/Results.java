package com.tchaikousky;

public class Results {

	private static double physics = 13;
	private static double chemistry = 52;
	private static double biology = 44;
	private static double total = physics + chemistry + biology;
	private static double percentage = (total * 100) / 450;
	private static double passMark = .6;
	private static double perfectScore = 150;
	private static boolean flag = false;

	public static void displayResults() {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		System.out.println("-------------------------");
		System.out.println("Total: " + total);

	}

	public static void getPercentage(double x, double y, double z) {
		System.out.println(percentage);
	}

	public static void testPass() {
		int count = 0;
		StringBuilder displayMessage = new StringBuilder();
		displayMessage.append("You did not pass the following classes: ");
		if (physics / perfectScore < passMark) {
			String x = "Physics";
			displayMessage.append(x);
			count += 1;
			flag = true;
		}
		if (chemistry / perfectScore < passMark) {
			String y = "Chemistry";
			if (count > 0) {
				displayMessage.append(", ");
			}
			displayMessage.append(y);
			count += 1;
			flag = true;

		}
		if (biology / perfectScore < passMark) {
			String z = "Biology";
			if (count >= 1) {
				displayMessage.append(" and ");
			}
			displayMessage.append(z);
			flag = true;
		}

		if (flag) {
			System.out.println(displayMessage);
		}
	}

	public static void main(String[] args) {
		displayResults();
		getPercentage(physics, chemistry, biology);
		testPass();
	}

}
