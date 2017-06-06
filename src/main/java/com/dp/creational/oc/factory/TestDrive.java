package com.dp.creational.oc.factory;


public class TestDrive {
	public static void main(String[] args) {
		try {
			VehicleFactory factory = VehicleFactory.INSTANCE;
			Vehicle vehicle = factory.createVehicle(VehicleTypes.Car.name());
			vehicle.drive();
			vehicle = factory.createVehicle(VehicleTypes.Truck.name());
			vehicle.drive();
			vehicle = factory.createVehicle(VehicleTypes.Car.name());
			vehicle.drive();
			vehicle = factory.createVehicle("truck1");
			vehicle.drive();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}