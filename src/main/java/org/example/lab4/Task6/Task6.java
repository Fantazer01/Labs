package org.example.lab4.Task6;

public class Task6 {
    public static void main(String[] args) {
        Item item = new Item("test item", 10.0);
        Discountedltem discItem1 = new Discountedltem("test item", 10.0, 0.2);
        Discountedltem discItem2 = new Discountedltem("test item", 10.0, 0.2);

        // Симметричность работает:
        System.out.println(discItem1.equals(item));
        System.out.println(discItem1.equals(discItem2));
        System.out.println(discItem2.equals(discItem1));
        System.out.println();

        // Транзитивность не работает:
        System.out.println(item.equals(discItem2));
        System.out.println(discItem1.equals(discItem2));
        System.out.println(discItem1.equals(item));
    }
}
