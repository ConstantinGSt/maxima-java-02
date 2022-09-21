package org.example;

public class Logistics {
	private Transport[] vehicles;
    public Logistics(Transport ... vehicles) {
		this.vehicles = vehicles;
		}
	public Transport getShipping(City city, int weight, int hours) {
		int j = 0;
		for(int i = vehicles.length-1; i >= 0; i--) {
			if(vehicles[i].getCapacity() >= weight ) {
				if(city.getDistanceKm()/vehicles[i].getSpeed() <= hours) {
					if(vehicles[i].getPrice(city) < vehicles[0].getPrice(city)) {
							j = i;
					}
				}
			}
		} return vehicles[j];
	}
	private boolean  isShippingAvailable() {

		return true;
	}


	public Transport[] getVehicles() {
		return vehicles;
	}
}
