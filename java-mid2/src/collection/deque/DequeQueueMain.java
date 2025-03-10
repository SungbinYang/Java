package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("poll = " + deque.poll());
        System.out.println("poll = " + deque.poll());
        System.out.println("poll = " + deque.poll());
        System.out.println(deque);
    }
}
