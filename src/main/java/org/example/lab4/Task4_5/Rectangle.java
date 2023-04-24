package org.example.lab4.Task4_5;

public class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) throws IllegalArgumentException {
        super(topLeft);
        if (width < 0 | height < 0) throw new IllegalArgumentException("Width and height cannot be negative");
        this.width = width;
        this.height = height;
    }

    public Rectangle(double topLeftX, double topLeftY, double width, double height) {
        this(new Point(topLeftX, topLeftY), width, height);
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width/2, point.getY() - height/2);
    }

    @Override
    public String toString() {
        return "Circle(topLeft=%s;width=%.1f;height=%.1f)".formatted(point, width, height);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(point, width, height);
    }
}
