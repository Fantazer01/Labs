package org.example.lab4.Task9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ToStringConverter {
    private static final Set<Class<?>> BOX_TYPES;

    static {
        BOX_TYPES = new HashSet<>();
        BOX_TYPES.add(Boolean.class);
        BOX_TYPES.add(Character.class);
        BOX_TYPES.add(Byte.class);
        BOX_TYPES.add(Short.class);
        BOX_TYPES.add(Integer.class);
        BOX_TYPES.add(Long.class);
        BOX_TYPES.add(Float.class);
        BOX_TYPES.add(Double.class);
        BOX_TYPES.add(Void.class);
        BOX_TYPES.add(String.class);
    }

    private final Set<Object> printedObject = new HashSet<>();

    public static boolean isBoxType(Class<?> cl) {
        return BOX_TYPES.contains(cl);
    }

    public String toString(Object object) throws IllegalAccessException {
        if (object == null)
            return "";

        StringBuilder sb = new StringBuilder(object.getClass().getSimpleName()).append("={");
        sb.append(toStringValueObject(object));

        printedObject.clear();

        return sb.append('}').toString();
    }

    private StringBuilder toStringValueObject(Object object) {
        StringBuilder sb = new StringBuilder();
        if (object == null)
            return sb.append("null");

        if (printedObject.contains(object))
            return sb.append("уже было");
        else
            printedObject.add(object);

        if (object.getClass().isArray()) {
            sb.append(Arrays.toString((Object[]) object));
        } else if (isBoxType(object.getClass())) {
            sb.append(toStringBoxTypeValue(object));
        } else {
            sb.append(toStringComplexObject(object));
        }
        return sb;
    }

    private StringBuilder toStringBoxTypeValue(Object object) {
        StringBuilder sb = new StringBuilder();
        if (object.getClass() == String.class) {
            sb.append("\"" + object + "\"");
        } else
            sb.append(object);
        return sb;
    }

    private StringBuilder toStringComplexObject(Object object) {
        String className = object.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();

        try {
            boolean putСomma = false;
            for (Field f : object.getClass().getDeclaredFields()) {
                if (putСomma)
                    sb.append(", ");

                Object value = null;
                if (f.trySetAccessible()) {
                    f.setAccessible(true);
                    value = f.get(object);
                }
                sb.append(f.getType().getSimpleName()).append(' ').append(f.getName()).append('=').append(toStringValueObject(value));
                putСomma = true;
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        return sb;
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
