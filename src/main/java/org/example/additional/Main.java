package org.example.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1,y1,z1,r1;
        int x2,y2,z2,r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты x y z первого шара:");
        x1=scanner.nextInt();
        y1=scanner.nextInt();
        z1=scanner.nextInt();
        System.out.println("Введите радиус первого шара:");
        r1=scanner.nextInt();
        System.out.println("Введите координаты x y z второго шара:");
        x2=scanner.nextInt();
        y2=scanner.nextInt();
        z2=scanner.nextInt();
        System.out.println("Введите радиус второго шара:");
        r2=scanner.nextInt();
        Ball a = new Ball(x1,y1,z1,r1);
        Ball b = new Ball(x2,y2,z2,r2);
        System.out.println("Площадь круга пересечения шаров S="+a.InerArea(b));
    }
}
