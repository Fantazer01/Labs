package org.example.lab4.Danildop.Instanceof;

public class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Shape)) return false;
        Shape other = (Shape) obj;
        return x == other.x && y == other.y;
    }
}
