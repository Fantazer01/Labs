package org.example.lab4.Task1_3;

import org.example.lab4.Task1_3.Points.LabeledPoint;
import org.example.lab4.Task1_3.Points.Point;

public class Task1 {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);

        LabeledPoint lpoint = new LabeledPoint("Test", 2, 3);

        // System.out.println(lpoint.x); // ошибка
        System.out.println(lpoint.getX());

        System.out.println(lpoint);
    }
}
