package org.example.lab4.Task11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task11 {
    public static void main(String[] args) {

        try {
            Class<?> cl = Class.forName("java.lang.System");
            Field field = cl.getField("out");
            Method m = field.getType().getDeclaredMethod("println", String.class);
            m.invoke(field.get(null), "Hello world");
        } catch (Exception ex) {
            System.out.println("Ohh");
        }


    }
}
