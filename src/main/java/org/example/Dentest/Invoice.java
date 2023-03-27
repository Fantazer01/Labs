package org.example.Dentest;


import java.util.ArrayList;

public class Invoice {
    private static class Item { // Класс Item вложен в класс Invoice
        String description;
        int quantity;
        double unitPrice;
        double price() { return quantity * unitPrice; }
    }
    private ArrayList<Item> items = new ArrayList<> () ;
    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }
    public String getDesc(int i){return this.items.get(i).description;}
    public int getsize(){return this.items.size();}
}