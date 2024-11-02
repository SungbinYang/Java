package mission.ch08.beginner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("결과: " + result);
        }

        scanner.close();
    }
}
