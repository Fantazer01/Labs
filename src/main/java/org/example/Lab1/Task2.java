package org.example.Lab1;

import java.util.Scanner;

public class Task2 {
    public void Invoke()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((n%360+360)%360);
        System.out.println(Math.floorMod(n, 360));
    }
}
