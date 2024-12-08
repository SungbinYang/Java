package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        System.out.println(sb);
    }
}
