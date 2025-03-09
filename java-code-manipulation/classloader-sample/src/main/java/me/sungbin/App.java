package me.sungbin;

public class App {

    Book book = new Book(); // 심볼릭 레퍼런스

    static String name;

    static {
        name = "sungbin";
    }

    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}