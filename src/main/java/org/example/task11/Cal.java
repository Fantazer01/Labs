package org.example.task11;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.lang.System.*;
import static java.time.DayOfWeek.*;
import static java.time.LocalDate.*;

public class Cal {

    public static void print() {
        printNamesOfWeekDays();
        printNumbersOfMonth(of(now().getYear(), now().getMonthValue(), 1));
    }

    public static void printNamesOfWeekDays() {
        for (int i = 0; i < 7; i++) {
            out.printf("%4s", of((i + 6) % 7 + 1).toString().substring(0, 3));
        }
        out.println();
    }

    public static void printNumbersOfMonth(LocalDate date) {
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue()%7;
        for (int i = 1; i < value + 1; i++)
            out.print("    ");

        while (date.getMonthValue() == now().getMonthValue()) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek() == SUNDAY) {
                out.println();
            }
        }
    }
}
