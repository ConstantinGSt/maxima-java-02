package org.example;

public abstract class Transport implements Repairable {
    private String name;
    private int capacity;
    private int speed;
    private float costOfKm;

    private boolean finishRepair;

    public Transport(String name, int capacity, int speed, float costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
        this.finishRepair = true;
    }

    public abstract float getPrice(City city);

    public void startRepair() {
        this.finishRepair = false;
    }

    public void finishRepair() {
        this.finishRepair = true;
    }

    public boolean isRepairing() {
        if(this.finishRepair == true) {
            return true;
        }
        return false;
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

    public boolean isFinishRepair() {
        return finishRepair;
    }

    public void setFinishRepair(boolean finishRepair) {
        this.finishRepair = finishRepair;
    }

}
