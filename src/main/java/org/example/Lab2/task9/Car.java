package org.example.task9;

public class Car {

    /**
     * param x - координата x, изменяемый параметр
     * param tankVolume - объем бака, неизменяемый параметр
     * param gasLeft - оставшийся бензин в баке, изменяемый параметр
     * param fuelConsumption - расход топлива, неизменяемый параметр
     */

    private double x;
    private final int tankVolume;
    private double gasLeft;
    private final double fuelConsumption;

    // Конструктор
    public Car(double fuelConsumption, int tankVolume) {
        this.x = 0;
        this.tankVolume = tankVolume;
        this.gasLeft = tankVolume;
        this.fuelConsumption = fuelConsumption;
    }

    // Геттер для дистанции
    public double getDistance() {
        return this.x;
    }

    // Геттер для оставшегося бензина
    public double getGasLeft() {
        return this.gasLeft;
    }

    // Перемещение машины
    public boolean translate(double x) {
        double gas = x / this.fuelConsumption;
        if (gas > this.gasLeft) {
            return false;
        }
        this.x += x;
        this.gasLeft -= gas;
        return true;
    }

    // Заправка машина
    public boolean fillCar(double fuel) {
        if (this.gasLeft + fuel > this.tankVolume) return false;
        this.gasLeft += fuel;
        return true;
    }

    // Перегруженный метод toString, чтобы можно было выводить
    // объект Point в System.out.print()
    @Override
    public String toString() {
        return "Car(" + this.x + ",\n    tankVolume: " + this.tankVolume + "\n    gasLeft: " +
                this.gasLeft + "\n    fuelConsumption: " + this.fuelConsumption + ")";
    }
}
