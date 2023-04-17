package org.example.lab3.comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Bioba", 393, false),
                new Employee("Biba", 393, true),
                new Employee("Biiba", 393, true),
                new Employee("Boba", 939, false),
                new Employee("Boss", -5, true)
        };
        /*
        Arrays.sort(employees, new EmployeeComparator()
                .thenComparing(Employee::getInsurance)
                .thenComparing(Employee::getName));
        */
        Comparator<Employee> comparator = new EmployeeComparator()
                .thenComparing(Employee::getInsurance)
                .thenComparing(Employee::getName);

        for (int i = 0; i < employees.length; ++i) {
            for (int j = 0; j < employees.length; ++j) {
                if (comparator.compare(employees[i], employees[j]) <= 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        for (int i = 0; i < employees.length; ++i)
            System.out.println(employees[i]);
    }
}
