package org.example;

public class Logistics {
	private Logistics[] vehicles;


	public Logistics getVehicles(int i) {
		return vehicles[i];
	}

	public void setVehicles(Object ... vehicles) {
		this.vehicles = new Logistics[vehicles.length];
	}
}
