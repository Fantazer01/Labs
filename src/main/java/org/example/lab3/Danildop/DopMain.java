package org.example.lab3.Danildop;

import org.example.lab3.comparator.Employee;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class DopMain {
    public static void main(String[] args) {
        System.out.println("---------------------------firstCase---------------------------");
        firstCase();
        System.out.println("---------------------------secondCase---------------------------");
        secondCase();
        System.out.println("---------------------------thirdCase---------------------------");
        thirdCase();
    }

    private static void firstCase() {
        String[] array = getStrings();

        Iterator<String> iterator = MyIterator.fromIterator(Arrays.stream(array)
                .iterator()).filter(str -> str.length() > 3);

        while (iterator.hasNext())
                System.out.println(iterator.next());
    }

    private static String[] getStrings() {
            return new String[] {
                "Aha",
                "Ogo",
                "Nice",
                "Coca cola",
            };
        }

    private static void secondCase() {
        Employee[] employees = getEmployees();

        Predicate<Employee> predicate = (emp) -> {
            return emp.getName().length() > 4;
        };

        Iterator<Employee> iterator = MyIterator.fromIterator(Arrays.stream(employees)
                    .iterator()).filter(predicate);

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    private static void thirdCase() {
        Employee[] employees = getEmployees();

        BiFunction<Employee, Employee, Employee> func =
                (emp1, emp2) -> {
                    return emp2;
                };
        Iterator<Employee> iterator = MyIterator.fromIterator(Arrays.stream(employees)
                .iterator()).reduce(func);

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    private static Employee[] getEmployees() {
        return new Employee[] {
                new Employee("Bioba", 393, false),
                new Employee("Biba", 393, true),
                new Employee("Biiba", 393, true),
                new Employee("Boba", 939, false),
                new Employee("Boss", -5, true)
        };
    }

}
