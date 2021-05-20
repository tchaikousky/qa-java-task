package com.tchaikousky.inheritance;

public class Employee extends Person {
	
	private double annualSalary;
	private double weeklySalary;
	
	public Employee() {
		super();
		this.annualSalary = 0;

	}
	
	public Employee(String name, double annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();

	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public double calculateWeeklySalary() {
		if (this.annualSalary != 0) {
			return this.annualSalary / 52;
		}
	
		return 0;
	}
	
}
