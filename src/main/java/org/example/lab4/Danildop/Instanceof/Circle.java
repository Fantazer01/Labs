package org.example.lab4.Danildop.Instanceof;



public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        Circle other = (Circle) obj;
        return super.equals(other) && radius == other.radius;
    }
}
