package com.tchaikousky.inheritance;

import java.util.ArrayList;

public class Manager extends Employee {
	
	private ArrayList<Employee> employeesUnderManager;

	public Manager() {
		super();

	}

	public Manager(String name, double annualSalary) {
		super(name, annualSalary);
		this.employeesUnderManager = new ArrayList<Employee>();

	}
	
	public void addEmployee(Employee employee) {
		this.employeesUnderManager.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		int count = 0;
		int index = -1;
		for(Employee subordinate : this.employeesUnderManager) {
			if(subordinate.getName().equals(employee.getName())) {
				index = count;
			}
			count++;
		}
		
		if(index != -1) {
			this.employeesUnderManager.remove(index);
		} else {
			System.out.println("Employee not found!");
		}
		
	}
	
	public void getEmployees() {
		for(Employee employee : employeesUnderManager) {
			System.out.print(employee.getName() + " ");
		}
		System.out.println();
	}
	
}
