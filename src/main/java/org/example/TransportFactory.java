package org.example;

public class TransportFactory {

//    public  Transport getTransport(City city, int weight, int hours) {
//        final String planeName = "Airbase";
//        final float planeCoast= 850;
//        final String shipName = "Black Sail";
//        final float shipCoast = 350;
//        final String truckName = "Universal truck";
//        final float truckCoast = 50;
//
//        if(city.getDistanceKm()/hours <=40) {
//            if(city.isOnWater()) {
//
//             //   transportCreate = new Ship(shipName, )
//            }
//        }
//    }
    private int roundedSpeed(City city, int hours) {
        return ((city.getDistanceKm() / hours) / 10 * 10) + 10;
    }
    private int roundedCapacity(int weight) {
        return ((weight) / 500 * 500) + 500;
    }
}
