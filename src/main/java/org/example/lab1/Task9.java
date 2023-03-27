package org.example.lab1;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string1:");
        String str1 = in.nextLine();
        System.out.print("Enter string2:");
        String str2 = in.nextLine();

        System.out.println("Result ignore case:" + str1.trim().equalsIgnoreCase(str2.trim()));
    }
}
