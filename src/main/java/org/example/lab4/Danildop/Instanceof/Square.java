package org.example.lab4.Danildop.Instanceof;


public class Square extends Shape {


    public Square(int x, int y) {
        super(x, y);

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Square)) return false;
        Square other = (Square) obj;
        return super.equals(other);
    }
}