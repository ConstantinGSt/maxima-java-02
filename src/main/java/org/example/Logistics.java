package org.example;

public class Logistics {
    private Transport[] vehicles;

    public Logistics(Transport... vehicles) {
        this.vehicles = vehicles;
    }

    private Transport min; // подмена на getShipping

    public Transport getShipping(City city, int weight, int hours) {

        for(int j = 0; j < vehicles.length; j++) {
            if((vehicles[j].isRepairing() && isShippingAvailable(city, weight, hours, j) == true)) {
                if(vehicles[j].getPrice(city) > 0) {
                    min = vehicles[j];
                    break;
                }
            }
        }
        for(int i = 0; i < vehicles.length; i++) {
            if((vehicles[i].isRepairing() && isShippingAvailable(city, weight, hours, i) == true)) {
                if(min.getPrice(city) > vehicles[i].getPrice(city) && vehicles[i].getPrice(city) > 0) {
                    min = vehicles[i];
                }
            }
        }
        return min;
    }

    private boolean isShippingAvailable(City city, int weight, int hours, int i) {
        return vehicles[i].getCapacity() >= weight &&
                (city.getDistanceKm() / vehicles[i].getSpeed() <= hours || hours == 0);
    }

    public Transport[] getVehicles() {
        return vehicles;
    }
}
