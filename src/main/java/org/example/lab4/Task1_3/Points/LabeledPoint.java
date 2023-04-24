package org.example.lab4.Task1_3.Points;

import java.util.Objects;

public class LabeledPoint extends Point {
    private final String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LabeledPoint other = (LabeledPoint) obj;
        return Double.compare(other.x, x) == 0 && Double.compare(other.y, y) == 0 && Objects.equals(label, other.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }

    @Override
    public String toString() {
        return String.format("LabeledPoint(%s;%.1f;%.1f)", label, x, y);
    }
}
