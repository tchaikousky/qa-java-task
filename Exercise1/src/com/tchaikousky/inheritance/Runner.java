package com.tchaikousky.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Employee bob = new Employee("Bob", 55000.00);
		Employee chris = new Employee("Chris", 65000.00);
		Employee sarah = new Employee("Sarah", 72629.00);
		Employee tiffany = new Employee("Tiffany", 45681.00);
		Manager michael = new Manager("Michael", 105500.00);
		
		chris.getName();
		michael.addEmployee(bob);
		michael.addEmployee(tiffany);
		michael.addEmployee(sarah);
		michael.addEmployee(chris);
		michael.calculateWeeklySalary();
		
		michael.getEmployees();
		michael.removeEmployee(chris);
		michael.getEmployees();
	}

}
