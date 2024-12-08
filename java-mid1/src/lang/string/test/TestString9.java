package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splitEmail = email.split("@");
        String id = splitEmail[0];
        String domain = splitEmail[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);
    }
}
