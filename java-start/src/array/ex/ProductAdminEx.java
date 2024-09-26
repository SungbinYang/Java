package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxCount = 10;
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[maxCount];
        int[] productPrices = new int[maxCount];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (productCount >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                }
            } else if (choice == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ":" + productPrices[i] + "원");
                    }
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력값입니다.");
            }
        }
    }
}
