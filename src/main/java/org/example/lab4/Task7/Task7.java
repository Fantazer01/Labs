package org.example.lab4.Task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        for (Color value: Color.values()) {
            System.out.printf("R: %d, G: %d, B: %d%n", value.getRed(), value.getGreen(), value.getBlue());
        }
        System.out.println(Arrays.toString(Color.values()));
    }
}
