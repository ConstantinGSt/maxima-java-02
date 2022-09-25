package org.example;

public class Ship extends Transport {

	public Ship(String name, int capacity, int speed, float costOfKm) {
		super(name, capacity, speed, costOfKm);
	}

	public float getPrice(City city) {
		if(city.isOnWater() == true) {
			return (float) (city.getDistanceKm() * getCostOfKm());
		} else return 0;
	}

	public void startRepair() {
		setFinishRepair(false);
	}

	public void finishRepair() {
		setFinishRepair(true);
	}

	public boolean isRepairing() {
		if(isFinishRepair() == true) {
			return true;
		}
		return false;
	}
}



