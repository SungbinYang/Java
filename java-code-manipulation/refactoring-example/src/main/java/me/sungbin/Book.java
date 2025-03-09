package me.sungbin;

public class Book {

    public static String A = "A";

    private String b = "B";

    public Book() {
    }

    public Book(String b) {
        this.b = b;
    }

    private void c() {
        System.out.println("C");
    }

    public int sum(int left, int right) {
        return left + right;
    }
}
