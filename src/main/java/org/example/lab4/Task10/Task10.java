package org.example.lab4.Task10;

import org.example.lab4.Task9.Item;
import org.example.lab4.Task9.ToStringConverter;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Class<?> _class = int[].class;//Class.forName();
        while (_class != null) {
            for (Method method : _class.getMethods()) {
                System.out.println(
                        Modifier.toString(method.getModifiers()) + " " +
                        method.getReturnType().getCanonicalName() +  " " +
                        method.getName() + Arrays.toString(method.getParameters())
                );
            }
            System.out.println();
            _class = _class.getSuperclass();
        }


    }
}
