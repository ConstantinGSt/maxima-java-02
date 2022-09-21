package org.example;

public class Logistics {
	private Transport[] vehicles;
    public Logistics(Transport ... vehicles) {
		this.vehicles = vehicles;
		}
//	public Logistics(Transport[] vehicles) {
//		this.vehicles = vehicles;
//	}
	public Transport getVehicles(int i) {
		return vehicles[i];
	}
}
