package collection.compare.test;

public enum Emblem {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOBAR("♣");

    private final String description;

    Emblem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
