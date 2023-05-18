package org.example.lab4.Task12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Task12 {

    public static void main(String[] args) {

        long dif1=1L, dif2;
        try {
            long startTime = System.nanoTime();

            Class<?> cl = Class.forName("java.lang.System");
            Field field = cl.getField("out");
            Method m = field.getType().getDeclaredMethod("println", String.class);
            m.invoke(field.get(null), "Hello world");
            long estimatedTime = System.nanoTime() - startTime;
            dif1 = estimatedTime;
            System.out.println(estimatedTime);
        } catch (Exception ex) {
            System.out.println("Ohh");
        }

        long startTime = System.nanoTime();
        System.out.println("Hello world");
        long estimatedTime = System.nanoTime() - startTime;
        dif2 = estimatedTime;
        System.out.println(estimatedTime);

        System.out.println(dif1/dif2);
    }


}
