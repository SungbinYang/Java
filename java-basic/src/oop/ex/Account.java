package oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }

        balance -= amount;
    }
}