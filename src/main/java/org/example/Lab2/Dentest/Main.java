package org.example.Dentest;

public class Main {
    public static void main(String[] argv) {
        Invoice newIvoice = new Invoice();
        newIvoice.addItem("tester1",1,2);
        newIvoice.addItem("tester2",1,2);
        newIvoice.addItem("tester3",1,2);
        for(int i=0;i<newIvoice.getsize();i++)
            System.out.println(newIvoice.getDesc(i));
    }
}
