package thread.sync.test;

import static util.MyLogger.log;

public class SyncTest2Main {
    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter();

        Runnable runnable = myCounter::count;

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class MyCounter {
        public void count() {
            int localValue = 0;

            for (int i = 0; i < 1000; i++) {
                localValue++;
            }

            log("결과: " + localValue);
        }
    }
}
