package org.example;

public class Truck extends Transport implements Repairable {

	public Truck(String name, int capacity, int speed, float costOfKm) {
		super(name, capacity, speed, costOfKm);

	}

	@Override
	public float getPrice(City city) {
		return (float) (city.getDistanceKm() * getCostOfKm());
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
