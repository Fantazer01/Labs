package org.example.lab3;

public class Task13 {
    public static void main(String[] args) {
        Runnable[] arrayOfRunnable = {
                () -> System.out.println(1),
                () -> System.out.println(2),
                () -> System.out.println(3),
                () -> System.out.println(4),
        };
        runAll(arrayOfRunnable).run();
    }

    public static Runnable runAll(Runnable[] arrayOfRunnable) {
        return () -> {
            for (Runnable runnable : arrayOfRunnable)
                runnable.run();
        };
    }
}
