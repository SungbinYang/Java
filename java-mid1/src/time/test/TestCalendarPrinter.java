package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate lastDate = startDate.with(TemporalAdjusters.lastDayOfMonth());

        // 이 부분 생각 못함
        int offsetWeekDays = startDate.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        for (int i = 0; i < lastDate.getDayOfMonth(); i++) {
            LocalDate plusDays = startDate.plusDays(i);
            System.out.printf("%2d ", plusDays.getDayOfMonth()); // 이 부분 생각 못함 :: printf
            if (plusDays.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
        }
    }
}
