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

    // Перемещение машины
    public boolean translate(double x) {
        double gas = Math.abs(x / this.fuelConsumption);
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
        return "Дистанция от начала координат: " + Math.abs(this.x) + "\nОбъем бака: " + this.tankVolume + "\nТоплива осталось: " +
                this.gasLeft + "\nРасход топлива: " + this.fuelConsumption;
    }
}
