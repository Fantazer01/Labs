package org.example.lab2.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ball a = readBallFromConsole(scanner,
                "Введите координаты x y z первого шара:",
                "Введите радиус первого шара:"
        );

        Ball b = readBallFromConsole(scanner,
                "Введите координаты x y z второго шара:",
                "Введите радиус второго шара:"
        );

        System.out.println("Площадь круга пересечения шаров S="+a.innerArea(b));
    }

    public static Ball readBallFromConsole(Scanner scanner, String msgForCoordinate, String msgForRadius) {
        int x,y,z,r;
        System.out.println(msgForCoordinate);
        x=scanner.nextInt();
        y=scanner.nextInt();
        z=scanner.nextInt();
        System.out.println(msgForRadius);
        r=scanner.nextInt();
        return new Ball(x,y,z,r);
    }
}
