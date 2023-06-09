package org.example.lab4.Task4_5;

import org.example.lab4.Task1_3.Points.Point;

public class Line extends Shape{
    private final Point to;

    public Line(Point from, Point to) throws IllegalArgumentException {
        super(from);
        if (from.equals(to)) throw new IllegalArgumentException("Points cannot be equal.");
        this.to = to;
    }

    public Line(double toX, double toY, double fromX, double fromY) throws IllegalArgumentException {
        this(new Point(fromX, fromY), new Point(toX, toY));
    }

    @Override
    public Point getCenter() {
        double x, y;

        if (to.getX() >= point.getX()) x = to.getX() - (to.getX() - point.getX()) / 2;
        else x = point.getX() - (point.getX() - to.getX()) / 2;

        if (to.getY() >= point.getY()) y = to.getY() - (to.getY() - point.getY()) / 2;
        else y = point.getY() - (point.getY() - to.getY()) / 2;

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Line(from=%s;to=%s)".formatted(point, to);
    }

    @Override
    public Line clone() {
        return new Line(point, to);
    }
}
