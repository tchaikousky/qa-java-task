package com.tchaikousky;

public class Coin {

	public static void main(String[] args) {
		System.out.println(getChange(5.62, 10.00));

	}
	
	public static String getChange(double cost, double payment) {
		StringBuilder totalChangeDue = new StringBuilder();
		
		double amountDue = findChangeAmount(cost, payment);
		int dollarsDue = (int) (amountDue / 1) ;
		double change = (amountDue - dollarsDue) * 100;
		
		String notes = notesDue(dollarsDue);
		String coins = changeDue((int)change);
		
		totalChangeDue.append(notes);
		totalChangeDue.append(coins);
		
		return totalChangeDue.toString();
	}
	
	public static double findChangeAmount(double cost, double payment) {
		double amountDue = payment - cost;
		
		return amountDue;
	}
	
	public static String notesDue(int amountDue) {
		StringBuilder notes = new StringBuilder();
		int fifty = amountDue / 50;
		int afterFiftyDue = amountDue % 50;
		int twenty = afterFiftyDue / 20;
		int afterTwentyDue = afterFiftyDue % 20;
		int ten = afterTwentyDue / 10;
		int afterTenDue = afterTwentyDue % 10;
		int five = afterTenDue / 5;
		int afterFiveDue = afterTenDue % 5;
		int one = afterFiveDue / 1;
//		double afterOne = afterFiveDue % 1;
		
		if(fifty != 0) {
			notes.append(fifty + " - $50 note(s)\n");
		}
		if(twenty != 0) {
			notes.append(twenty + " - $20 note(s)\n");
		}
		if(ten != 0) {
			notes.append(ten + " - $10 note(s)\n");
		}
		if(five != 0) {
			notes.append(five + " - $5 note(s)\n");
		}
		if(one != 0) {
			notes.append(one + " - $1 note(s)\n");
		}
		return notes.toString();
	}
	
	public static String changeDue(int amountDue) {
		StringBuilder change = new StringBuilder();
		int quarter = amountDue / 25;
		int afterQuarterDue = amountDue % 25;
		int dime = afterQuarterDue / 10;
		int afterDimeDue = afterQuarterDue % 10;
		int nickel = afterDimeDue / 5;
		int afterNickelDue = afterDimeDue % 5;
		int penny = afterNickelDue / 1;
		
		if(quarter != 0) {
			change.append(quarter + " - quarter(s)\n");
		}
		if(dime != 0) {
			change.append(dime + " - dime(s)\n");
		}
		if(nickel != 0) {
			change.append(nickel + " - nickel(s)\n");
		}
		if(penny != 0) {
			change.append(penny + " - penny\n");
		}
		
		return change.toString();
	}

}
