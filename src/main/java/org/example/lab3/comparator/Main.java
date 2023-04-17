package org.example.lab3.comparator;

public class Main {
    public static void main(String[] args) {
        Employee biba = new Employee("Biba", 393);
        Employee boba = new Employee("Boba", 939);

        System.out.println(new EmployeeComparator().compare(biba, boba));
    }
}
