package com.tchaikousky.abstraction;

import java.util.ArrayList;

public class Garage {
	
	public double width;
	public double height;
	public double length;
	public ArrayList<Vehicle> vehicleList;
	
	public Garage(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.vehicleList = new ArrayList<>();
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}
	
	public String removeVehicle(Vehicle vehicleToRemove) {
		int count = 0;
		int index = -1;
		for(Vehicle vehicle : this.vehicleList) {
			if(vehicle.getName().equals(vehicleToRemove.getName())) {
				index = count;
				break;
			}
			count++;
		}
		
		if(index != -1) {
			this.vehicleList.remove(index);
			return vehicleToRemove.getName() + " has been removed from the garage.";
		} else {
			return "Vehicle not found!";
		}
		
		
	}
	
	public void removeByType(String typeOfVehicle) {
		ArrayList<Vehicle> vehiclesToRemove = new ArrayList<>();
		
		for(Vehicle vehicle : this.vehicleList) {
			if(vehicle.getClass().getSimpleName().equals(typeOfVehicle)) {
				vehiclesToRemove.add(vehicle);
			}
		}
		
		if(vehiclesToRemove.size() > 0) {
			for(Vehicle vehicle : vehiclesToRemove) {
				removeVehicle(vehicle);
			}
		}
	}
	
	public void removeById(int id) {
		int index = -1;
		for(int i = 0; i < vehicleList.size(); i++) {
			if(vehicleList.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			vehicleList.remove(index);
		}
	}
	
	
	public void emptyGarage() {
		this.vehicleList.clear();
	}
	
	public double calculateBill(Vehicle vehicle) {
		double vehicleArea = vehicle.getLength() * vehicle.getHeight();
		double billAmount = 0;
		int storageFee = 200;
		
		if(vehicle instanceof Car) {
			billAmount = (vehicleArea * 1.5) + storageFee;
		} else if(vehicle instanceof Truck) {
			billAmount = (vehicleArea * 1) + storageFee;
		} else if(vehicle instanceof Boat) {
			billAmount = (vehicleArea * .5) + storageFee;
		}	
		return billAmount;	
	}
	
	public void presentBills() {
		System.out.println("Garage Invoice");
		System.out.println("-----------------------------------------");
		for(Vehicle vehicle : this.vehicleList) {
			double bill = calculateBill(vehicle);
			System.out.println(vehicle.getMake() + " " + vehicle.getModel() + ":           " + bill);
		}
	}
	
	public void presentSingleBill(Vehicle vehicle) {
		System.out.println(vehicle.getName() + "'s Bill");
		System.out.println("-------------------------------------------");
		double billAmount = calculateBill(vehicle);
		System.out.println(vehicle.getMake() + " " + vehicle.getModel() + ": " + "     -     " + billAmount);
	}
	
	public void showVehicleList() {
		System.out.println("Current Inventory");
		System.out.println("-----------------------");
		for(Vehicle vehicle : this.vehicleList) {
			System.out.println(vehicle.getName());
		}
	}
}
