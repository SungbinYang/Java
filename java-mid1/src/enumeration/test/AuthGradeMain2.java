package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(authGrades) + ": ");
        String myGrade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.judgeGrade(myGrade);
        printMenu(authGrade);

        scanner.close();
    }

    private static void printMenu(AuthGrade authGrade) {
        System.out.println("==메뉴 목록==");

        switch (authGrade) {
            case GUEST:
                System.out.println("- 메인 화면");
                break;
            case LOGIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                break;
            case ADMIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
                break;
        }
    }
}
