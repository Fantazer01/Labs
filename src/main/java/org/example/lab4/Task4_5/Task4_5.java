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

        try {
            Circle circle1 = new Circle(5, 4, 0);
            massivePrint(circle1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println();
        }

        Rectangle rect = new Rectangle(1, -2, 10, 20);
        massivePrint(rect);

        try {
            Rectangle rect1 = new Rectangle(1, -2, -1, 20);
            massivePrint(rect1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println();
        }

        Line line = new Line(-1, 2, 6, -5);
        massivePrint(line);

        try {
            Line line1 = new Line(-1, 2, -1, 2);
            massivePrint(line1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println();
        }
    }
}
