package org.example.lab4.Task9;

public class Task9 {
    public static void main(String[] args) throws IllegalAccessException {
        Item item = new Item();
        Item2 item2 = new Item2();
        item2.item.item2 = item2;
        int i = 5;
        ToStringConverter toStringConverter = new ToStringConverter();
        System.out.println(toStringConverter.toString(i));
        System.out.println(toStringConverter.toString(item));
        System.out.println(toStringConverter.toString(item2));
    }
}
