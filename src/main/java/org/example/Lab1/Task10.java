package org.example.Lab1;

import java.util.Random;

public class Task10 {
    public void Invoke()
    {
        Random random = new Random();
        long n = random.nextLong() % 36;
        System.out.println(Long.toString(n, 36));
    }
}
