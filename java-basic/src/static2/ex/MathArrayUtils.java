package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
