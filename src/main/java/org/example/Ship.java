package org.example;

public class Ship extends Transport implements Repairable {

	public Ship(String name, int capacity, int speed, float costOfKm) {
		super(name, speed, capacity, costOfKm);
	}
	public float getPrice(City city) {
		if(city.isOnWater() == true) {
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

