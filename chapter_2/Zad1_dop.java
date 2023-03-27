import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1_dop {

    public static void main(String[] argv) {
        printNumbersOfMonth(LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), 1));
    }

    public static void printNumbersOfMonth(LocalDate date) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type day (1 - Monday to 7 - Sunday): ");
        int dayOfWeek = 0;
        try {
            dayOfWeek = in.nextInt();
            in.close();
        } catch (InputMismatchException e) {
            in.close();
            System.out.println("Must be integer!");
            System.exit(1);
        }

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Must be in range [1; 7]!");
            System.exit(1);
        }
        showNamesOfWeekDays(dayOfWeek);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        for (int i = 1; i < (dayOfWeek>value?(8-dayOfWeek)+value: value-(dayOfWeek-1)); i++)
            System.out.print("    ");
        while (date.getMonthValue() == LocalDate.now().getMonthValue()) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == (dayOfWeek==1?7:dayOfWeek-1)) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }

    public static void showNamesOfWeekDays(int day) {
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4s", DayOfWeek.of(i+day==7?7:(i+day)%7).toString().substring(0, 3));
        }
        System.out.println();
    }
}
