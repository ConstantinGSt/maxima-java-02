package org.example;

public class Logistics {
	private Transport[] vehicles;
    public Logistics(Transport ... vehicles) {
		this.vehicles = vehicles;
		}
	private Transport[] min = new Transport[1]; // подмена на getShipping

	public Transport getShipping(City city, int weight, int hours) {
		for(int j = 0; j < vehicles.length; j++) {
			if(vehicles[j].getCapacity() >= weight &&
								(city.getDistanceKm() / vehicles[j].getSpeed() <= hours) || hours ==0) {
				if(vehicles[j].getCapacity() > 0) {
					min[0] = vehicles[j];
					break;
				}
			}
		}
		for(int i = 0; i < vehicles.length; i++) {
			if(vehicles[i].getCapacity() >= weight &&
					(city.getDistanceKm() / vehicles[i].getSpeed() <= hours) || hours ==0) {
				if(min[0].getPrice(city) > vehicles[i].getPrice(city) && vehicles[i].getPrice(city) > 0) {
					min[0] = vehicles[i];
				}
			}
		} return min[0];
	}

//	private boolean isShippingAvailable(City city, int weight, int hours, int i) {
//		if(vehicles.getCapacity() >= weight && city.getDistanceKm() / vehicles.getSpeed() <= hours) {
//			return true;
//			} return false;
//		}
	private boolean  isShippingAvailable() {

		return true;
	}

	public Transport[] getVehicles() {
		return vehicles;
	}
}
