package org.example.lab2.task9;

import java.util.Scanner;

public class Task9 {
    private static void menu() {
        System.out.println("1. Статус\n2. Заправиться\n3. Ехать\n4. Вернуться в начало координат\n0. Выход");
        System.out.print("Ваш выбор: ");
    }

    public static void main(String[] args) {
        Car car = new Car(5, 50);
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        do {
            menu();

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Неверный ввод.\n");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(car);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Количество топлива: ");
                    double fuel;

                    if (scanner.hasNextInt()) {
                        fuel = scanner.nextDouble();
                    } else {
                        System.out.println("Неверный ввод.\n");
                        scanner.nextLine();
                        break;
                    }
                    car.fillCar(fuel);
                    System.out.println();
                    break;

                case 3:
                    try {
                        System.out.println();
                        System.out.print("Координаты точки, в которую поедет машина: ");

                        String[] str_coord = new String[0];
                        if (scanner.hasNextLine()) {
                            str_coord = scanner.nextLine().split(" ");
                            if (str_coord.length != 2) {
                                System.out.println("Неверный формат координат.\n");
                                break;
                            }
                        }

                        car.translate(new Car.Point(Double.parseDouble(str_coord[0]), Double.parseDouble(str_coord[1])));
                        System.out.println();
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Неверный формат координат.\n");
                    }

                case 4:
                    car.translateToOrigin();
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
