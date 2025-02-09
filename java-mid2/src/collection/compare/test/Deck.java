package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initialize();
    }

    public void initialize() {
        addCard();
        shuffle();
    }

    public void addCard() {
        for (int i = 1; i <= 13; i++) {
            for (Emblem emblem : Emblem.values()) {
                cards.add(new Card(i, emblem));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card giveCard() {
        return cards.removeFirst();
    }
}
