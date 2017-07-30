package playing_cards;

public class TarotPlayingCard extends PlayingCard {
    private boolean isTrump;
    private TrumpCardNumber trumpCardNumber;

    public TarotPlayingCard(CardNumber number, Color color){
        super(number, color);
        this.isTrump = False;
        this.trumpCardNumber = TrumpCardNumber.NONE
    }

    public TarotPlayingCard(TrumpCardNumber trumpCardNumber){
        super(CardNumber.NONE, CardColor.NONE);
        this.isTrump = True;
        this.trumpCardNumber = trumpCardNumber;
    }

    public TrumpCardNumber getTrumpCardNumber() {
        return trumpCardNumber;
    }

    public boolean isTrump() {
        return isTrump;
    }

    public TarotPlayingCard clone() {
        if (isTrump) {
            return new TarotPlayingCard(this.trumpCardNumber);            
        } else {
            return new TarotPlayingCard(this.number, this.color);
        }
    }

    public String toString() {
        if (isTrump) {
        return String.format("%s", trumpCardNumberToString(color));           
        } else {
            return super(this.number, this.color);
        }
    }

    /**
     * Convert a TrumpCardNumber enum to a String representation.
     */
    private String trumpCardNumberToString(TrumpCardNumber number){
        switch(number){
            case ONE:
                return "1T";
            case TWO:
                return "2T";
            case THREE:
                return "3T";
            case FOUR:
                return "4T";
            case FIVE:
                return "5T";
            case SIX:
                return "6T";
            case SEVEN:
                return "7T";
            case EIGHT:
                return "8T";
            case NINE:
                return "9T";
            case TEN:
                return "10T";
            case ELEVEN:
                return "11T";
            case TWELVE:
                return "12T";
            case THIRTEEN:
                return "13T";
            case FOURTEEN:
                return "14T";
            case FIFTEEN:
                return "15T";
            case SIXTEEN:
                return "16T";
            case SEVENTEEN:
                return "17T";
            case EIGHTEEN:
                return "18T";
            case NINETEEN:
                return "19T";
            case TWENTY:
                return "20T";
            case TWENTY_ONE:
                return "21T";
            case FOOL:
                return "F";
            case NONE:
            default:
                return "";
        }

    public boolean equals(TarotPlayingCard card) {
        return (super.equals(card)) && (this.trumpCardNumber == card.getTrumpCardNumber());
    }
}