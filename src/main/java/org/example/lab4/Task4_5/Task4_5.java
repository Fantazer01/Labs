package org.example.lab4.Task4_5;

public class Task4_5 {
    private static void massivePrint(Shape shape) {
        System.out.println(shape);
        System.out.println(shape.getCenter());
        System.out.println("Clone = " + shape.clone());
        System.out.println();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, 4, 10);
        massivePrint(circle);

        Rectangle rect = new Rectangle(1, -2, 10, 20);
        massivePrint(rect);

        Line line = new Line(-1, 2, 6, -5);
        massivePrint(line);
    }
}
