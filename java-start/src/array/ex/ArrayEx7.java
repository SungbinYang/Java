package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] studentsScores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        int[] totalScores = new int[4];
        double[] averageScores = new double[4];

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
