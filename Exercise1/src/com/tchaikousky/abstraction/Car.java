package com.tchaikousky.abstraction;

public class Car extends Vehicle {
	
	private String interiorColor;
	private String engine;
	
	public Car(String make, String model, String color, int weight, double length, double width, double height, String interiorColor, String engine) {
		super(make, model, color, weight, length, width, height);
		this.interiorColor = interiorColor;
		this.engine = engine;
	}
	
	@Override
	public void move() {
		System.out.println(this.getModel() + " is traveling at a smooth 85mph.");
		
	}

	@Override
	public void alert() {
		System.out.println( this.getModel() + " goes: Beep, Beep!");
		
	}

	public String getInteriorColor() {
		return interiorColor;
	}

	public void setInteriorColor(String interiorColor) {
		this.interiorColor = interiorColor;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	

}
