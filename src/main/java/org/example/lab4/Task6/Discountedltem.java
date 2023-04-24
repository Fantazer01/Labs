package org.example.lab4.Task6;

public class Discountedltem extends Item{
    private final double discount;

    public Discountedltem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }

        if (!(otherObject instanceof Discountedltem other)) {
            return false;
        }

        return discount == other.discount;
    }

}
