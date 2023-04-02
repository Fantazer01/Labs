package org.example.lab2.task16;

public class Task16 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        Queue.Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.remove();
        System.out.println(queue);
    }
}
