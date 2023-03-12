
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex1 {

    public static void main(String[] argv) {
        NamesOfWeekDays();
        NumbersOfMonth(LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), 1));
    }

    public static void NamesOfWeekDays() {
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4s", DayOfWeek.of((i + 6) % 7 + 1).toString().substring(0, 3));
        }
        System.out.println();
    }
    public static void NumbersOfMonth(LocalDate date) {
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue()%7;
        for (int i = 1; i < value + 1; i++)
            System.out.print("    ");

        while (date.getMonthValue() == LocalDate.now().getMonthValue()) {

            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
        }
    }


}