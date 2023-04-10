package org.example.lab3.task8;

public class Task8 {
    public static void main(String[] args) {
        Greeter g1 = new Greeter(5, "Ваня");
        Greeter g2 = new Greeter(3, "Петя");

        Thread thread1 = new Thread(g1);
        Thread thread2 = new Thread(g2);

        thread1.start();
        thread2.start();
    }
}
