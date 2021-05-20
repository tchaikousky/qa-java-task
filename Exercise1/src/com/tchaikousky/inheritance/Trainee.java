package com.tchaikousky.inheritance;

import java.util.ArrayList;

public class Trainee extends Person{
	
	private double bursary;
	private ArrayList<String> subjectsLearned;
	
	public Trainee() {
		super();

	}
	
	public Trainee(String name, double bursary) {
		super(name);
		this.bursary = bursary;
		this.subjectsLearned = new ArrayList<String>();
		
	}

	public double getBursary() {
		return bursary;
	}

	public void setBursary(double bursary) {
		this.bursary = bursary;
	}

	public ArrayList<String> getSubjectsLearned() {
		return subjectsLearned;
	}

	public void setSubjectsLearned(ArrayList<String> subjectsLearned) {
		this.subjectsLearned = subjectsLearned;
	}
	
	
	

}
