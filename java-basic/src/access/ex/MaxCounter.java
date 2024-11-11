package access.ex;

public class MaxCounter {

    private int count;

    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        if (validateCount(count)) {
            count++;
        }
    }

    private boolean validateCount(int count) {
        if (count >= max) {
            System.out.println("최대 값을 초과할 수 없습니다.");
            return false;
        }

        return true;
    }
}
