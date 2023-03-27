package org.example.lab2.task11;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.lang.System.*;
import static java.time.DayOfWeek.*;
import static java.time.LocalDate.*;

public class Cal {

    public static void print() {
        print(SUNDAY);
    }

    public static void print(DayOfWeek dayOfWeek) {

        printNamesOfWeekDays(dayOfWeek.getValue());
        printNumbersOfMonth(of(now().getYear(), now().getMonthValue(), 1), dayOfWeek);
    }

    public static void printNamesOfWeekDays(int delta) {
        for (int i = 0; i < 7; i++) {
            out.printf("%4s", of((i + 6 + delta) % 7 + 1).toString().substring(0, 3));
        }
        out.println();
    }

    public static void printNumbersOfMonth(LocalDate date, DayOfWeek setDayOfWeek) {
        DayOfWeek weekday = date.getDayOfWeek();
        int value = (weekday.getValue()+7-setDayOfWeek.getValue())%7;
        for (int i = 1; i < value + 1; i++)
            out.print("    ");

        while (date.getMonthValue() == now().getMonthValue()) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek() == setDayOfWeek) {
                out.println();
            }
        }
    }
}
