package org.example.lab4;

abstract class Car {
    protected String fuel = "gasoline";
    private String color;
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void drive();
}

abstract class Bus extends Car {
}

class SuperBus extends Bus {

    @Override
    public void drive() {
        System.out.println("SuperBus drives");
    }

    public void fuel() {
        System.out.println(fuel);
    }
}

public class DopInvar {
    public static void main(String[] args) {
        SuperBus bus = new SuperBus();
        bus.setColor("Green");
        System.out.println(bus.getColor());
        bus.drive();
        bus.startEngine();
        bus.fuel();
    }
}
