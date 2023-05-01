package org.example.lab4.Task9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ToStringConverter {
    public static String toString(Object obj) {
        Class<?> _class = obj.getClass();
        StringBuilder stringBuilder = new StringBuilder(_class.getName());
        stringBuilder.append(" { ");
        for (Field field : _class.getDeclaredFields()) {
            stringBuilder.append("\n\t");
            stringBuilder.append(printParamField(field));
            stringBuilder.append(field.getName());
        }
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }

    private static String printParamField(Field field) {
        int mod = field.getModifiers();
        return stringAccess(mod);
    }

    private static String stringAccess(int mod) {
        if (Modifier.isPrivate(mod))
            return "private ";
        if (Modifier.isProtected(mod))
            return "protected ";

        return "public ";

    }
}
