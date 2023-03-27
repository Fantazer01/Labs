package org.example.lab1;

import java.util.Scanner;

public class Task11 {
    public void Invoke()
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int i = 0; i < str.length(); ++i)
            if (str.charAt(i) > 127)
                System.out.println("U+" + Integer.toString(str.charAt(i), 16));
    }
}
