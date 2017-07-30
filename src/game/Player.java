public class Player {
    private int score;
    private Deck deck;

    public Player(Deck deck) {
        this.deck = deck;
        this.score = 0;
    }

    public Player(Deck deck, int score) {
        this.deck = deck;
        this.score = score;
    }

    public void playCard(PlayingCard playingCard) {
        this.removeCard(playingCard);
    }

    public boolean hasCard(PlayingCard playingCard) {
        return deck.contains(playingCard);
    }

    public boolean hasAnyCards() {
        return deck.getNumberOfCards() != 0;
    }

    public void removeCard(PlayingCard playingCard) {
        this.removeCard(playingCard);
    }

    private void removeCard(PlayingCard playingCard) {
        deck.removeCard(playingCard);
    }

    private void addCard(PlayingCard playingCard) {
        deck.addCard(playingCard);
    }

    public void touchScore(int scoreToAdd) {
        score += scoreToAdd;
    }

    public Deck getDeck() {
        return deck;
    }

    public score getScore() {
        return score;
    }
}