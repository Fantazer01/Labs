package org.example.task16;

public class Task16 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println(queue);
        Queue<String>.Iterator iter1 = queue.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        while (queue.size()>0){
            System.out.println(queue.remove());
        }
        System.out.println(queue);

        Queue<String>.Iterator iter2 = queue.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
            iter2.remove();
        }
        System.out.println(queue);
    }
}
