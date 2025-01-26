package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];

        System.out.print("로또 번호: ");

        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (numbers[j] == number) {
                    break;
                }
            }

            numbers[i] = number;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
