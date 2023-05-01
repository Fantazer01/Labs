package org.example.lab2.task16_17;

import java.util.NoSuchElementException;

public class Queue {
    public class Iterator {
        private Node next;
        private Node ptr;
        private Node previous;

        private Iterator() {
            previous = null;
            ptr = null;
            next = head;
        }

        public boolean hasNext() {
            return next != null;
        }

        public String next() {
            if (hasNext()) {
                String res = next.value;
                previous = ptr;
                ptr = next;
                next = ptr.next;
                return res;
            } else {
                throw new NoSuchElementException("next = null");
            }
        }

        public void remove() {
            if (ptr == null)
                throw new NoSuchElementException("");

            if (previous == null) {
                ptr = next;
                if (hasNext())
                    next = ptr.next;
                head = ptr;
            } else {
                ptr = next;
                if (hasNext())
                    next = ptr.next;
                previous.next = ptr;
            }
        }
    }

    private static class Node {
        private final String value;
        private Node next;

        Node(String value) {
            this.value = value;
            this.next = null;
        }

        public String value() {
            return value;
        }

        public Node next() {
            return next;
        }
    }

    private Node head;
    private Node tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public Iterator iterator() {
        return new Iterator();
    }

    /**
     * добавляет элемент в хвост очереди
     */
    public void add(String value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    /**
     * удаляет элемент из головы очереди
     */
    public void remove() {
        if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    /**
     * Перегруженный метод toString, чтобы можно было выводить
     *  объект Queue в System.out.print()
     * @return возвращает строку с содержимым очереди
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = head;
        sb.append("[");
        if (node != null) {
            do {
                sb.append("'");
                sb.append(node.value());
                sb.append("'");
                if (node.next != null) {
                    sb.append(",");
                }
                node = node.next();
            } while(node != null);
        }
        sb.append("]");
        return sb.toString();
    }
}
