package org.example.Dentest2;

public class Main {
    public static void main(String[] argv) {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("fred");
        System.out.println(fred.getname());
        fred.leave();
    }
}
