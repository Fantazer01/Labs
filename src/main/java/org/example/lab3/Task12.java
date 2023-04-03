package org.example.lab3;

import java.io.File;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        File[] files = {
          new File("/home/oleg/IdeaProjects/Labs/Labs/src/main/java/org/example/lab3"),
          new File("/home/oleg/IdeaProjects/Labs/Labs/src/main/java/org/example/lab2/Task1.java"),
          new File("/home/oleg/IdeaProjects/Labs/Labs/src/main/java/org/example/lab1"),
          new File("/home/oleg/IdeaProjects/Labs/Labs/src/main/java/org/example/lab2/Task4.java"),
          new File("/home/oleg/IdeaProjects/Labs/Labs/src/main/java/org/example/lab2"),
        };

        for (File file : files)
            System.out.println(file.getName());

        Arrays.sort(files, (f1, f2) -> {
            if ((f1.isDirectory() && f2.isDirectory()) || (f1.isFile() && f2.isFile())) {
                return f1.getAbsolutePath().compareTo(f2.getAbsolutePath());
            } else {
                // (f1 - directory, f2 - file) -> -1
                // (f1 - file, f2 - directory) -> 1
                return f1.isDirectory() ? -1 : 1;
            }
        });
        System.out.println("------------------Sorted-Version------------------");
        for (File file : files)
            System.out.println(file.getName());
    }
}
