package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        player1.receiveCardFrom(deck);
        player2.receiveCardFrom(deck);

        player1.showCards();
        player2.showCards();

        Player player = getPlayer(player1, player2);

        if (player != null) {
            System.out.println(player.getName() + " 승리");
            return;
        }

        System.out.println("무승부");
    }

    private static Player getPlayer(Player player1, Player player2) {
        if (player1.sumEmblem() > player2.sumEmblem()) {
            return player1;
        }

        if (player1.sumEmblem() == player2.sumEmblem()) {
            return null;
        }

        return player2;
    }
}
