package org.example.lab3.comparator;

public class EmployeeComparator implements OurComparator<Employee>{
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.getName().equals("Boss") && emp2.getName().equals("Boss"))
            return 0;
        else if (emp1.getName().equals("Boss")) {
            return 1;
        } else if (emp2.getName().equals("Boss")) {
            return -1;
        }

        return Double.compare(emp1.getSalary(), emp2.getSalary());
    }
}
