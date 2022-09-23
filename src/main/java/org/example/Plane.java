package org.example;

public class Plane extends Transport implements Repairable {

	public Plane(String name, int capacity, int speed, float costOfKm) {
		super(name, capacity, speed, costOfKm);
	}

	public float getPrice(City city) {
		if(city.hasAirport() == true) {
			return (float) (city.getDistanceKm() * getCostOfKm());
		} else return 0;
	}

	@Override
	public void startRepair() {

	}

	@Override
	public void finishRepair() {

	}

	@Override
	public boolean isRepairing() {
		return false;
	}
}
