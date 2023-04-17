package org.example.lab3.task14;

import java.util.Arrays;
import java.util.Comparator;

public class Task14 {
    public static void main(String[] args) {
        Employee[] employees = createEmployees();

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName));

        for (int i = 0; i < employees.length; ++i)
            System.out.println(employees[i]);
        System.out.println();

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed()
                .thenComparing(Employee::getName).reversed());

        for (int i = 0; i < employees.length; ++i)
            System.out.println(employees[i]);
    }

    private static Employee[] createEmployees() {
        return new Employee[] {
                new Employee("Oleg", 12),
                new Employee("Danil", 8.999),
                new Employee("Invar", 12),
                new Employee("Ivan", 9999.9999)
        };
    }

    public static class Employee {
        private String name;
        private double salary;

        public Employee() {}

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "name: " + name + ", salary: " + salary;
        }
    }
}
