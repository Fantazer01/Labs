package org.example.lab2.task9;

public class Task9 {
    public static void main(String[] args) {
        Car car = new Car(5, 50);
        System.out.println(car);
        if (car.translate(10)) {
            System.out.println(true);
        }
        System.out.println(car);
        System.out.println(car.getDistance());
        System.out.println(car.getGasLeft());
        if (car.fillCar(2)) {
            System.out.println(true);
        }
        System.out.println(car);
    }
}
