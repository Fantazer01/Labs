package org.example.task9;

public class Car {

    /**
     * param x - координата x
     * param tankVolume - объем бака
     * param gasLeft - оставшийся бензин в баке
     * param fuelConsumption - расход топлива
     */

    private double x;
    private final int tankVolume;
    private double gasLeft;
    private final double fuelConsumption;

    public Car(double fuelConsumption, int tankVolume) {
        this.x = 0;
        this.tankVolume = tankVolume;
        this.gasLeft = tankVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public double getDistance() {
        return this.x;
    }

    public double getGasLeft() {
        return this.gasLeft;
    }

    public boolean translate(double x) {
        double gas = x / this.fuelConsumption;
        if (gas > this.gasLeft) {
            return false;
        }
        this.x += x;
        this.gasLeft -= gas;
        return true;
    }

    public boolean fillCar(double fuel) {
        if (this.gasLeft + fuel > this.tankVolume) return false;
        this.gasLeft += fuel;
        return true;
    }

    @Override
    public String toString() {
        return "Car(" + this.x + ",\n    tankVolume: " + this.tankVolume + "\n    gasLeft: " +
                this.gasLeft + "\n    fuelConsumption: " + this.fuelConsumption + ")";
    }
}
