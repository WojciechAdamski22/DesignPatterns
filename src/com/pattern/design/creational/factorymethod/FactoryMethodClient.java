package com.pattern.design.creational.factorymethod;

import java.util.Scanner;

public class FactoryMethodClient {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String vehicleType = in.nextLine().toLowerCase();
		
		VehicleFactory factory = new VehicleFactory();
		try {
			Vehicle vehicle = factory.getVehicle(vehicleType);
			
			vehicle.design();
			vehicle.manufacture();
		} catch (VehicleTypeNotFoundException e) {
			System.out.println("Invalid vehicle type entered!");
		}
		in.close();
	}

}
