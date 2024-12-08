package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        // 조금 어려웠음
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int index = -1;
        int count = 0;

        while (true) {
            index = str.indexOf(key, (index + 1), str.length());

            if (index == -1) {
                break;
            }

            count++;
        }

        System.out.println("count = " + count);
    }
}
