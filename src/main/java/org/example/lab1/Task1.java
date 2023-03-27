package org.example.lab1;

import java.util.Scanner;

public class Task1 {
    public void Invoke()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toString(n, 8));
        System.out.println(Integer.toString(n, 16));
    }
}
