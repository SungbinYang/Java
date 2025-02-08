package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> histories = new ArrayDeque<>();

    public void visitPage(String url) {
        System.out.println("방문: " + url);
        histories.push(url);
    }

    public String goBack() {
        histories.pop();
        System.out.println("뒤로가기: " + histories.peek());
        return histories.peek();
    }
}
