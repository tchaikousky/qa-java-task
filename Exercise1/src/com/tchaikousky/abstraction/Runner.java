package com.tchaikousky.abstraction;

public class Runner {
	
	public static void main(String[] args) {		
		Car samCar = new Car("samCar", "Nissan", "Altima", "Black", 4069, 14, 9, 5, "tan",  "V8");
		Truck joeTruck = new Truck("joeTruck", "Nissan", "Titan", "Grey", 8245, 18, 12, 6.5, 6, true);
		Boat larryBoat = new Boat("larryBoat", "Lund", "Pro-V-Bass", "red", 1475, 19, 12, 5, true,  false);
		Boat mikeBoat = new Boat("mikeBoat", "Lund", "Pro-V-Bass", "blue", 1475, 19, 12, 5, true,  false);
		Boat terriBoat = new Boat("terriBoat", "Lund", "Pro-V-Bass", "purple", 1475, 19, 12, 5, true,  false);
		
		samCar.alert();
		samCar.move();
		joeTruck.alert();
		joeTruck.move();
		larryBoat.alert();
		larryBoat.move();
		System.out.println("larryBoat id = " + larryBoat.getId());
		System.out.println("joeTrueck id = " + joeTruck.getId());
		System.out.println();
		
		Garage myGarage = new Garage(250.00, 500.00, 60.00);
		
		myGarage.addVehicle(samCar);
		myGarage.addVehicle(joeTruck);
		myGarage.addVehicle(larryBoat);
		myGarage.addVehicle(mikeBoat);
		myGarage.addVehicle(terriBoat);
		
		myGarage.presentBills();
		System.out.println();
		myGarage.presentSingleBill(joeTruck);
		System.out.println();
		myGarage.showVehicleList();
		System.out.println();
		myGarage.removeVehicle(joeTruck);
		myGarage.showVehicleList();
		System.out.println();
		myGarage.removeById(4);
		myGarage.showVehicleList();
		System.out.println();
		myGarage.removeByType("Boat");
		myGarage.showVehicleList();
		System.out.println();
		myGarage.emptyGarage();
		myGarage.showVehicleList();
	}
}
