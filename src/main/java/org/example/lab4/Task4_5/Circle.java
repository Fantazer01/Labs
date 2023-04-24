package org.example.lab4.Task4_5;

public class Circle extends Shape {
    private final double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this(new Point(x, y), radius);
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public String toString() {
        return "Circle(center=%s;radius=%.1f)".formatted(point, radius);
    }

    @Override
    public Circle clone() {
        return new Circle(point, radius);
    }
}
