package org.example;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            // модифицирующий метод add возвращает значение boolean
            // для уведомления об успешности или не успешности операции
            boolean result = array.add(i*i);
            System.out.println(result);
            // также есть примеры возвращающие объект [метод ArrayList.remove(int)]
        }

        for (Integer a : array) {
            System.out.println("element: " + a);
        }
    }
}
