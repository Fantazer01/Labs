package org.example.lab4;

import org.example.lab2.task16_17.Queue;
import org.example.lab4.Task1_3.Points.Point;

import java.util.LinkedList;

public class Task8 {

    public static void main(String[] args) {

        Class<?>[] objects = {
                String[].class,
                new LinkedList<>().getClass(),
                Object.class,
                Queue.Iterator.class,
                int.class,
                new Point(0, 0).getClass(),
                Integer.class
        };


        for (Class<?> obj : objects) {
            System.out.println("--------------> Name: " + obj.getName());
            printInfo(obj);
        }

    }

    private static void printInfo(Class<?> someClass) {
        System.out.println(
                "toString:  " + someClass.toString() + '\n'
                        + "toGenericString:  " + someClass.toGenericString() + '\n'
                        + "descriptorString:  " + someClass.descriptorString() + '\n'
                        + "getCanonicalName:  " + someClass.getCanonicalName() + '\n'
                        + "getSimpleName:  " + someClass.getSimpleName() + '\n'
                        + "getTypeName:  " + someClass.getTypeName() + '\n'
        );
    }
}