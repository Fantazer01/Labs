package org.example.lab2.task9;

public class Car {

    public static class Point {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
            this(0, 0);
        }

        public double x() {
            return this.x;
        }

        public double y() {
            return this.y;
        }

        public double distance(Point point) {
            // d = sqrt(x^2 + y^2)
            return Math.sqrt(Math.pow(point.x() - this.x, 2) + Math.pow(point.y() - this.y, 2));
        }

        @Override
        public String toString() {
            return String.format("(%.2f, %.2f)", x, y);
        }
    }

    /**
     * param x - координата x, изменяемый параметр
     * param tankVolume - объем бака, неизменяемый параметр
     * param gasLeft - оставшийся бензин в баке, изменяемый параметр
     * param fuelConsumption - расход топлива, неизменяемый параметр
     */

    private Point coord;
    private double distance;
    private final int tankVolume;
    private double gasLeft;
    private final double fuelConsumption;

    // Конструктор
    public Car(double fuelConsumption, int tankVolume) {
        this.coord = new Point();
        this.tankVolume = tankVolume;
        this.gasLeft = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.distance = 0;
    }

    // Перемещение машины
    public void translate(Point point) {
        double distance = this.coord.distance(point);
        double gas = distance / this.fuelConsumption;
        if (gas > this.gasLeft) {
            double real_dist = this.gasLeft * this.fuelConsumption;
            this.coord = new Point(this.coord.x() + point.x() / distance * real_dist,
                    this.coord.y() + point.y() / distance * real_dist);
            this.gasLeft = 0;
            System.out.println(real_dist);
            this.distance += real_dist;
        } else {
            this.coord = point;
            this.gasLeft -= gas;
            System.out.println(distance);
            this.distance += distance;
        }
    }

    public void translateToOrigin() {
        translate(new Point());
    }

    // Заправка машина
    public void fillCar(double fuel) {
        if (this.gasLeft + fuel > this.tankVolume) {
            this.gasLeft = this.tankVolume;
            return;
        }
        this.gasLeft += fuel;
    }

    // Перегруженный метод toString, чтобы можно было выводить
    // объект Point в System.out.print()
    @Override
    public String toString() {
        return "Координаты: " + coord + "\nПройдено расстояние: " + distance + "\nТоплива осталось: " + this.gasLeft +
                "\nОбъем бака: " + this.tankVolume + "\nРасход топлива: " + this.fuelConsumption;
    }
}
