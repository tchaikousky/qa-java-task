package com.tchaikousky.abstraction;

public abstract class Vehicle {
	
	private String name;
	private String make;
	private String model;
	private String color;
	private int weight;
	private double length;
	private double width;
	private double height;
	public abstract void move();
	public abstract void alert();
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String make, String model) {
		this.name = name;
		this.make = make;
		this.model = model;
	}
	
	public Vehicle(String name, String make, String model, String color, int weight, double length, double width, double height) {
		this(name, make, model);
		this.color = color;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
