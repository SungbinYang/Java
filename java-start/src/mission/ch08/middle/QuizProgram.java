package mission.ch08.middle;

import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "성빈클럽의 창시자는 누구인가요?",
                "Java에서 문자열을 비교하는 메서드는 무엇인가요?",
                "Java의 기본 자료형 중 정수를 나타내는 자료형은?",
                "Java에서 배열의 길이를 알기 위해 사용하는 속성은?",
                "Java에서 조건문을 나타내는 키워드는?"
        };

        String[] answers = {"양성빈", "equals", "int", "length", "if"};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            System.out.print("정답을 입력하세요: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("정답입니다!");
                score++;
            } else {
                System.out.println("오답입니다. 정답은 " + answers[i] + "입니다.");
            }
            System.out.println();
        }

        System.out.println("최종 점수: " + score + "/" + questions.length);
        scanner.close();
    }
}
