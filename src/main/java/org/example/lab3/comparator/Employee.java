package org.example.lab3.comparator;

public class Employee {
    private String name;
    private double salary;
    private boolean insurance;

    public Employee() {}

    public Employee(String name, double salary, boolean insurance) {
        this.name = name;
        this.salary = salary;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "name: " + name + ", salary: " + salary + ", insurance: " + insurance;
    }
}
