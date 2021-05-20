package com.tchaikousky.abstraction;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		Car altima = new Car("Nissan", "Altima", "Black", 4069, 14, 9, 5, "tan",  "V8");
		Truck titan = new Truck("Nissan", "Titan", "Grey", 8245, 18, 12, 6.5, 6, true);
		Boat proVBass = new Boat("Lund", "Pro-V-Bass", "red", 1475, 19, 12, 5, true,  false);
		
		altima.alert();
		altima.move();
		titan.alert();
		titan.move();
		proVBass.alert();
		proVBass.move();
		
		ArrayList<Vehicle> garage = new ArrayList<>();
		garage.add(proVBass);
		garage.add(titan);
		garage.add(altima);
		
		for(Vehicle vehicle : garage) {
			System.out.print(vehicle.getModel() + " ");
		}
	}
}
