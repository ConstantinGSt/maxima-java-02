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
		setFinishRepair(true);
	}

	public void finishRepair() {
		setFinishRepair(false);
	}

	public boolean isRepairing() {
		if(isFinishRepair()) {
			return true;
		} return false;
	}
}


