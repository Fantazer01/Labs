package org.example.task6;

public class Task6 {
    public static void main(String[] args) {
        org.example.task6.Point p1 = new org.example.task6.Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p1);
        System.out.print("x: " + p1.getX() + ", y: " + p1.getY() + "\n");

        org.example.task6.Point p2 = new Point();
        System.out.println(p2);
    }
}
