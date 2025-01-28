package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate plusDate = date.with(TemporalAdjusters.lastDayOfMonth()); // 이 부분은 생각 못함


        System.out.println("firstDayOfWeek = " + date.getDayOfWeek());
        System.out.println("lastDayOfWeek = " + plusDate.getDayOfWeek());
    }
}
