package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private List<Card> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveCardFrom(Deck deck) {
        for (int i = 0; i < 5; i++) {
            cards.add(deck.giveCard());
        }
    }

    public void showCards() {
        cards.sort(null);
        System.out.println(name + "의 카드: " + cards + ", 합계: " + sumEmblem());
    }

    public int sumEmblem() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getNumber();
        }

        return sum;
    }
}
