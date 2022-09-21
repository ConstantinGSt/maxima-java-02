package org.example;

public class Logistics {
		private Transport[] vehicles;
    public Logistics(Transport ... vehicles) {
		this.vehicles = vehicles;
		}
	public Class<? extends Transport> getShipping(City city, int weight, int hours) {
		getVehicles();
		for(int i = vehicles.length-1; i>=0; i--) {
			if(vehicles[i].getCapacity() <= weight ) {
				if(city.getDistanceKm()/vehicles[i].getSpeed() <= hours) {
					System.out.println(vehicles[i].getClass());
					return vehicles[i].getClass();
				}
			}
		} return null;
	}

	public Transport[] getVehicles() {
		return vehicles;
	}
}
