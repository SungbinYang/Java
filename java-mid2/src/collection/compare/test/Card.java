package collection.compare.test;

public class Card implements Comparable<Card> {

    private int number;

    private Emblem emblem;

    public Card(int number, Emblem emblem) {
        this.number = number;
        this.emblem = emblem;
    }

    public int getNumber() {
        return number;
    }

    public Emblem getEmblem() {
        return emblem;
    }

    @Override
    public String toString() {
        return number + "(" + emblem.getDescription() + ")";
    }

    @Override
    public int compareTo(Card o) {
        if (this.number != o.number) {
            return Integer.compare(this.number, o.number);
        }

        return this.emblem.compareTo(o.emblem);
    }
}
