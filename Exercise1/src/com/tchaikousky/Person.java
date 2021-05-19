package com.tchaikousky;

public class Person {
	private String name; //
	private int age; //
	private String gender; //
	private boolean isBreathing;
	private int walkSpeed = 30; // in feet
// Constructor

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isBreathing() {
		return isBreathing;
	}


	public void setBreathing(boolean isBreathing) {
		this.isBreathing = isBreathing;
	}


	public int getWalkSpeed() {
		return walkSpeed;
	}


	public void setWalkSpeed(int walkSpeed) {
		this.walkSpeed = walkSpeed;
	}


	public void read(Book book) {
		System.out.println(this.name + " is reading the book titled: " + book.getTitle() + ".");
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}
}
