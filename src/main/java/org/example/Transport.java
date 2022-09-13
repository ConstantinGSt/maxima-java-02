package org.example;

import org.jetbrains.annotations.NotNull;

public class Transport {
    private String name;
    private int capacity;
    private int speed;
    private float costOfKm;

    public Transport(){
        };

    public Transport(String name, int capacity, int speed, float costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
    }

    public float getPrice(City city) {
        return (float) (city.getDistance() * getCostOfKm());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCostOfKm() {
        return costOfKm;
    }

    public void setCostOfKm(double costOfKm) {
        this.costOfKm = (float) costOfKm;
    }
}