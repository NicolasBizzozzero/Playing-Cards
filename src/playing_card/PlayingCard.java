package playing_cards;

public class PlayingCard {
    private CardColor color;
    private CardNumber number;

    public PlayingCard(CardNumber number, CardColor color){
        this.color = color;
        this.number = number;
    }

    /**
     * Convert a CardColor enum to a String representation.
     */
    private String cardColorToString(CardColor color){
        switch(color){
            case CLUBS:
                return "C";//"♣";
            case DIAMONDS:
                return "D";//"♦";
            case HEARTS:
                return "H";//"♥";
            case SPADES:
                return "S";//"♠";
            case NONE:
            default:
                return "";
        }
    }

    /**
     * Convert a CardNumber enum to a String representation.
     */
    private String cardNumberToString(CardNumber number){
        switch(number){
            case ONE:
                return "1";
            case TWO:
                return "2";
            case THREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            case TEN:
                return "10";
            case JACK:
                return "J";
            case CAVALIER:
                return "C";
            case QUEEN:
                return "Q";
            case KING:
                return "K";
            case JOKER:
                return "*";
            case NONE:
            default:
                return "";
        }
    }

    public CardColor getColor(){
        return color;
    }

    public CardNumber getCardNumber(){
        return number;
    }

    public PlayingCard clone(){
        return new PlayingCard(this.number, this.color);
    }

    public String toString(){
        return String.format("%s%s", cardNumberToString(number), cardColorToString(color));
    }

    public boolean equals(PlayingCard card){
        return (this.color == card.getColor()) && (this.number == card.getCardNumber());
    }
}