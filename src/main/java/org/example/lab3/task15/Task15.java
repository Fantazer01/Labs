package org.example.lab3.task15;

public class Task15 {
    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.randomInts(1, 9);

        for (int i = 0; i < 10; ++i)
            if (intSequence.hasNext())
                System.out.println(intSequence.next());
    }
}
