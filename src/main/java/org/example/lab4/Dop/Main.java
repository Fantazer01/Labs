package org.example.lab4.Dop;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Key {
}

record Pair<K, V>(K key, V value) {}

class MyClass {
    private String field1;
    private int field2;

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    @Key
    public String getField1() {
        return field1;
    }

    @Key
    public int getField2() {
        return field2;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        MyClass instance = set(MyClass.class, new Pair<>("field1", "value1"), new Pair<>("field2", 42));

        System.out.println(instance.getField1()); // Output: value1
        System.out.println(instance.getField2()); // Output: 42
    }

    @SafeVarargs
    public static <T> T set(Class<T> class_, Pair<String, Object>... pairs) throws Exception {
        T instance = class_.getDeclaredConstructor().newInstance();

        for (Pair<String, Object> pair : pairs) {
            String key = pair.key();
            Object value = pair.value();

            Method getter = findGetter(class_, key);
            if (getter != null) {
                String fieldName = getFieldNameFromGetter(getter.getName());
                Method setter = findSetter(class_, fieldName);
                if (setter != null) {
                    setter.invoke(instance, value);
                }
            }
        }
        return instance;
    }

    private static Method findGetter(Class<?> class_, String name) {
        Method[] methods = class_.getDeclaredMethods();

        for (Method method : methods) {
            if (isGetterMethod(method) && method.isAnnotationPresent(Key.class) && name.equals(getFieldNameFromGetter(method.getName()))) {
                return method;
            }
        }

        return null;
    }

    private static boolean isGetterMethod(Method method) {
        String methodName = method.getName();
        return methodName.startsWith("get") && method.getParameterCount() == 0 && !method.getReturnType().equals(void.class);
    }

    private static String getFieldNameFromGetter(String getterName) {
        return Character.toLowerCase(getterName.charAt(3)) + getterName.substring(4);
    }

    private static Method findSetter(Class<?> class_, String fieldName) {
        String setterName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);

        try {
            return class_.getMethod(setterName, class_.getDeclaredField(fieldName).getType());
        } catch (NoSuchMethodException | NoSuchFieldException e) {
            return null;
        }
    }
}
