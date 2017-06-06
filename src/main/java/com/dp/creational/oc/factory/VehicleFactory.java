package com.dp.creational.oc.factory;

import java.util.HashMap;
import java.util.Map;

public enum VehicleFactory {
	INSTANCE;
	private Map<String, Vehicle> vehicles = new HashMap<String, Vehicle>();

	public Vehicle createVehicle(String vehicleType) throws Exception {
		Vehicle vehicle = vehicles.get(vehicleType);
		if (vehicle != null) {
			return vehicle;
		} else {
			try {
				
				String name = Vehicle.class.getPackage().getName();
				
				vehicle = (Vehicle) Class.forName(name + "." + vehicleType)
						.newInstance();
				
				vehicles.put(vehicleType, vehicle);
				
				return vehicle;
			} catch (Exception e) {
				throw new Exception("The vehicle type is unknown!");
			}
		}
	}
}
