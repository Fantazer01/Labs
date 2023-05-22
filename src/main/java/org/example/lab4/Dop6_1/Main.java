package org.example.lab4.Dop6_1;

// https://javarush.com/groups/posts/646-kak-proiskhodit-zagruzka-klassov-v-jvm

class Main {
    public static void main(String[] args) throws Exception {
        CustomClassLoader1 classLoader1 = new CustomClassLoader1(
                "ru.mephi.Person",
                "C:\\Users\\pi-77\\IdeaProjects\\JavaLab\\target\\classes\\ru\\mephi\\Person.class"
        );
        CustomClassLoader2 classLoader2 = new CustomClassLoader2(
                "ru.mephi.Person",
                "C:\\Users\\pi-77\\IdeaProjects\\JavaLab\\target\\classes\\ru\\mephi\\Person.class"
        );

        Class<?> class1 = classLoader1.findClass("ru.mephi.Person");
        Class<?> class2 = classLoader2.findClass("ru.mephi.Person");

        Object object1 = class1.getDeclaredConstructor(String.class, int.class)
                .newInstance("John Doe", 25);

        Object a = class2.cast(object1);
    }
}
