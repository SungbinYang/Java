package poly.ex.pay0;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }

        scanner.close();
    }
}
