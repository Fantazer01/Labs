package org.example.lab4.Task9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ToStringConverter {
    public static String toString(Object obj) throws IllegalAccessException {
        if (obj.getClass() == String.class) {
            return "\"" + obj.toString() + "\"";
        } else if (obj.getClass() == Integer.class) {
            return obj.toString();
        } else {
            return recursion(obj);
        }
    }

    private static String recursion(Object obj) throws IllegalAccessException {
        Class<?> _class = obj.getClass();
        StringBuilder stringBuilder = new StringBuilder(_class.getName());
        stringBuilder.append(": { ");
        for (Field field : _class.getDeclaredFields()) {
            field.setAccessible(true);
            stringBuilder.append(field.getName());
            stringBuilder.append(" = ");
            stringBuilder.append(toString(field.get(obj)));
            stringBuilder.append("; ");

        }
        stringBuilder.append("}");
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
