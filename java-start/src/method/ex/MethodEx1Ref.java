package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        double average1 = calculateAverage(1, 2, 3);
        double average2 = calculateAverage(15, 25, 35);

        printAverage(average1);
        printAverage(average2);
    }

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void printAverage(double average) {
        System.out.println("평균값: " + average);
    }
}
