package org.example.lab4.compareEnumAndStaticFinal;

public class compareEnumAndStaticFinal {
    public static void main(String[] args) {
        System.out.println(ABC.A);
        System.out.println(ABCD.A);
    }

    public enum ABC {
        A, B, C;
    }

    public static final class ABCD {
        static final ABCD A = new ABCD(0);
        static final ABCD B = new ABCD(1);
        static final ABCD C = new ABCD(2);
        static final ABCD D = new ABCD(3);

        private int value;

        private ABCD(int n) { value = n; }

    }


}
