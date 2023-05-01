package org.example.lab2.task16_17;

public class Task16_17 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println(queue);


        Queue.Iterator iterator = queue.iterator();
        Queue.Iterator iterator2 = queue.iterator();
        /*
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
        iterator2.next();

        iterator.next();
        iterator.next();
        iterator.next();
        iterator2.remove();

        if (iterator.hasNext())
            System.out.println(iterator.next());
        else
            System.out.println("end");

        if (iterator.hasNext())
            System.out.println(iterator2.next());
        else
            System.out.println("end");


        if (iterator.hasNext())
            System.out.println(iterator2.next());
        else
            System.out.println("end");

        System.out.println(queue);
    }
}
