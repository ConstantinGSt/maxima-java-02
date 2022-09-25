package org.example;

public class Logistics {
    private Transport[] vehicles;

    public Logistics(Transport... vehicles) {
        this.vehicles = vehicles;
    }

    public Transport getShipping(City city, int weight, int hours) {
        
        Transport min = null; // подмена на getShipping

        for(int i = 0, counter = 0; i < vehicles.length; i++) {
            if(vehicles[i].isRepairing() && isShippingAvailable(city, weight, hours, i) && vehicles[i].getPrice(city) > 0) {
                counter++;
                if(counter > 1) {
                    min = vehicles[i].getPrice(city) < min.getPrice(city) ? vehicles[i] : min;
                } else {
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
