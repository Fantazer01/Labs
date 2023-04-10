package org.example.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("bar");
        strings.add("baz");
        strings.add("foo");
        strings.add("qux");

        Comparator<String> comp = String::compareTo;

        luckySort(strings, comp);

        System.out.println("Result: " + strings);
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (isSorted(strings, comp)) {
            System.out.println("Before: " + strings);
            Collections.shuffle(strings);
            System.out.println("After: " + strings);
            System.out.println();
        }
    }

    private static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
