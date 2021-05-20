package com.tchaikousky.abstraction;

public class Truck extends Vehicle{
	private int truckBedLength;
	private boolean isAWD;
	
	public Truck(String name, String make, String model, String color, int weight, double length, double width, double height, int truckBedLength, boolean isAWD) {
		super(name, make, model, color, weight, length, width, height);
		this.truckBedLength = truckBedLength;
		this.isAWD = isAWD;
	}

	@Override
	public void move() {
		System.out.println(this.getModel() + " has a heavy load and travels at 35mph.");
		
	}

	@Override
	public void alert() {
		System.out.println( this.getModel() + " goes: Honk, Honk!");
		
	}

	public int getTruckBedLength() {
		return truckBedLength;
	}

	public void setTruckBedLength(short truckBedLength) {
		this.truckBedLength = truckBedLength;
	}

	public boolean isAWD() {
		return isAWD;
	}

	public void setAWD(boolean isAWD) {
		this.isAWD = isAWD;
	}
	
	
}
