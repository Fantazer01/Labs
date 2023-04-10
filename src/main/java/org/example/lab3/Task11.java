package org.example.lab3;

import java.io.File;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        File file = new File("/home/oleg/IdeaProjects/Labs/Labs/src/main/java/org/example/lab3");

        if (file.exists() && file.isDirectory())
            doAction(file);
    }
    // переменная f захватывается объемлющим типом
    public static void doAction(File file) {
        String[] listOfFiles = file.list((File f, String name) -> Pattern.matches("(\\w*).java", name));
        assert listOfFiles != null;
        for (String fileName : listOfFiles)
            System.out.println(fileName);
    }
}
