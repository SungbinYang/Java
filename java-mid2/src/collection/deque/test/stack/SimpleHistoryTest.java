package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> pages = new ArrayDeque<>();

        pages.push("youtube.com");
        pages.push("google.com");
        pages.push("facebook.com");

        System.out.println(pages.pop());
        System.out.println(pages.pop());
        System.out.println(pages.pop());
    }
}
