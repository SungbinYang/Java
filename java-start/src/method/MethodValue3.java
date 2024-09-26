package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 변경 전, num1: " + num1);

        num1 = changeNumber(num1);

        System.out.println("changeNumber 변경 후, num1: " + num1);

    }

    public static int changeNumber(int num2) {
        num2 *= 2;

        return num2;
    }
}
