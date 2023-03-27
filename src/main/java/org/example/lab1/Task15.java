package org.example.lab1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = in.nextInt();

        int[][] s = new int [n][];
        for (int i = 0; i < n; i++) {
            s[i] = new int[i+1];
            s[i][0] = 1;
            for (int j = 1; j < i; j++)
                s[i][j] = s[i-1][j-1] + s[i-1][j];
            s[i][i] =  1;
        }

        int maxNum = s[n - 1][(n - 1)/2];
        int maxNumWidth = Integer.toString(maxNum).length();

        for (int i = 0; i < n; i++) {
            int stringPad = (n - 1 - i) * (maxNumWidth + 1) / 2;
            if (stringPad > 0)
                System.out.print(String.format("%" + stringPad + "s", ""));
            for (int j = 0; j <= i; j++) {
                String paddedNum = Integer.toString(s[i][j]);

                int totalPad = maxNumWidth - paddedNum.length();
                int rPad = totalPad / 2;
                if (rPad > 0)
                    paddedNum = String.format("%s%" + rPad + "s", paddedNum, "");
                int lPad = totalPad - rPad;
                if (lPad > 0)
                    paddedNum = String.format("%" + lPad + "s%s", "", paddedNum);
                System.out.print(paddedNum);
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}