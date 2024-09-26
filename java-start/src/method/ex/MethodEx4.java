package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            printMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("입금액을 입력하세요: ");
                    int depositMoney = scanner.nextInt();
                    balance = deposit(balance, depositMoney);
                }

                case 2 -> {
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawMoney = scanner.nextInt();

                    balance = withdraw(balance, withdrawMoney);
                }

                case 3 -> System.out.println("현재 잔액: " + balance + "원");

                case 4 -> {
                    System.out.println("시스템을 종료합니다.");
                    return;
                }

                default -> System.out.println("잘못된 키 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public static int withdraw(int balance, int withdrawMoney) {
        if (balance >= withdrawMoney) {
            balance -= withdrawMoney;
            System.out.println(withdrawMoney + "원을 출금하셨습니다. 현재 잔액은 " + balance + "원");
        } else {
            System.out.println(withdrawMoney + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static int deposit(int balance, int depositMoney) {
        balance += depositMoney;
        System.out.println(depositMoney + "원을 입금하셨습니다. 현재 잔액은 " + balance + "원");
        return balance;
    }

    public static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
        System.out.print("선택: ");
    }
}
