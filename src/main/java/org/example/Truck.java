package org.example;

public class Truck extends Transport {

	public Truck(String name, int capacity, int speed, float costOfKm) {
		super(name, capacity, speed, costOfKm);

	}

	@Override
	public float getPrice(City city) {
		return (float) (city.getDistanceKm() * getCostOfKm());
	}

	public void startRepair() {
		}

	public void finishRepair() {
		}

	public boolean isRepairing() {
		if(isFinishRepair() == true) {
			return true;
		}
		return false;
	}
}


