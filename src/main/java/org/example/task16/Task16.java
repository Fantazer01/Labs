package org.example.task16;

public class Task16 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
