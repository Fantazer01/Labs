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

        Queue.Iterator iter1 = queue.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
    }
}
