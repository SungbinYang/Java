package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int num = 1;

        while (num <= max) {
            sum += num;
            num++;
        }

        System.out.println(sum);
    }
}
