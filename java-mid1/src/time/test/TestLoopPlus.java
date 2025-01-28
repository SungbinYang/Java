package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate plusDate = date.plusWeeks(i * 2); // 이 부분을 ChronoUnit이런걸로 할 수 없을까 고민 했었음
            System.out.println("날짜 " + (i + 1) + ": " + plusDate);
        }
    }
}
