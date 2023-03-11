package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt(); // модифицирующий метод

        Random random = new Random();
        random.nextInt(); // метод доступа
    }
}
