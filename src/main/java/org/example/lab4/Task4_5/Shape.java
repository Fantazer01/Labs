package org.example.lab4.Task4_5;

public abstract class Shape {
    protected final Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.translate(dx, dy);
    }

    public abstract Point getCenter();
    public abstract Shape clone();
}
