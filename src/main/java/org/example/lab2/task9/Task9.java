package org.example.lab2.task9;

import java.util.Scanner;

public class Task9 {
    private static void menu() {
        System.out.println("1. Статус\n2. Заправиться\n3. Ехать\n0. Выход");
        System.out.print("Ваш выбор: ");
    }

    public static void main(String[] args) {
        Car car = new Car(5, 50);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(car);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Количество топлива: ");
                    double fuel = scanner.nextDouble();
                    if (car.fillCar(fuel)) {
                        System.out.println("Машина заправлена");
                    } else {
                        System.out.println("Машина не заправлена");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Количество километров, которые надо проехать: ");
                    double distance = scanner.nextDouble();
                    if (car.translate(distance)) {
                        System.out.println("Машина едет");
                    } else {
                        System.out.println("Машина не едет");
                    }
                    System.out.println();
                    break;

                case 0:
                    break;

                default:
                    System.out.println();
                    System.out.println("Неверный выбор, попробуйте еще раз.");
                    System.out.println();
                    break;
            }
        } while (choice != 0);
    }
}
