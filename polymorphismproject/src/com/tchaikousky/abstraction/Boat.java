package com.tchaikousky.abstraction;

public class Boat extends Vehicle{
	
	private boolean hasMotor;
	private boolean hasSail;

	public Boat(String name, String make, String model, String color, int weight, double length, double width, double height, boolean hasMotor, boolean hasSail) {
		super(name, make, model, color, weight, length, width, height);
		this.hasMotor = hasMotor;
		this.hasSail = hasSail;
	}

	@Override
	public void move() {
		System.out.println(this.getModel() + " is sailing at 52knots");
		
	}

	@Override
	public void alert() {
		System.out.println( this.getModel() + " goes: BOOOOOOOOOONK!");
		
	}

	public boolean isHasMotor() {
		return hasMotor;
	}

	public void setHasMotor(boolean hasMotor) {
		this.hasMotor = hasMotor;
	}

	public boolean isHasSail() {
		return hasSail;
	}

	public void setHasSail(boolean hasSail) {
		this.hasSail = hasSail;
	}

	
}
