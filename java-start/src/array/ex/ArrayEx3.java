package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println(numbers.length + "개의 정수를 입력하세요.");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("입력한 정수를 역순으로 출력: ");

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[numbers.length - 1 - i]);
            } else {
                System.out.print(numbers[numbers.length - 1 - i] + ",");
            }
        }
    }
}
