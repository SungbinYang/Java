package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1, max = 100, num = 0; num <= max; num++) {
            sum += num;
        }

        System.out.println(sum);
    }
}
