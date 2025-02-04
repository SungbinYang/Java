package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        for (Integer number : numbers) {
            System.out.print(number);
            if (numbers.indexOf(number) != numbers.size() - 1) {
                System.out.print(",");
            }
        }
    }
}
