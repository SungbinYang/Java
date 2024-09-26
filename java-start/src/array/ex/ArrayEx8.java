package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");

        int count = scanner.nextInt();
        int[][] studentsScores = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};
        int[] totalScores = new int[count];
        double[] averageScores = new double[count];

        for (int i = 0; i < studentsScores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < studentsScores[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                studentsScores[i][j] = scanner.nextInt();
                totalScores[i] += studentsScores[i][j];
            }
            averageScores[i] = (double) totalScores[i] / studentsScores[i].length;
        }

        for (int i = 0; i < studentsScores.length; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + totalScores[i] + ", 평균: " + averageScores[i]);
        }
    }
}
