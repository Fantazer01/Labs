package org.example.lab3;

import org.example.lab3.task8.Greeter;

public class Task9 {
    public static void main(String[] args) {
        Greeter g1 = new Greeter(1, "Ваня");
        Greeter g2 = new Greeter(2, "Петя");
        Greeter g3 = new Greeter(3, "Саша");
        runTogether(g1, g2, g3);
        System.out.println();
        runInOrder(g1, g2, g3);
    }

    public static void runTogether(Runnable... tasks) {
        Thread[] threads = new Thread[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task: tasks) {
            task.run();
        }
    }
}
