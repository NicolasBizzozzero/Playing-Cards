package playing_cards;
import java.util.ArrayList;

public class Deck {
    private ArrayList<PlayingCard> setOfCards;
    private int numberOfCards;

    public Deck() {
        setOfCards = new ArrayList<>();
        numberOfCards = 0;
    }

    public Deck(ArrayList<PlayingCard> setOfCards){
        this.setOfCards = setOfCards;
        numberOfCards = setOfCards.size();
    }

    /**
     * Remove cardToThrow from the set of cards.
     */
    public void removeCard(PlayingCard cardToThrow){
        setOfCards.remove(cardToThrow);
        numberOfCards--;
    }

    /**
     * Remove the first card at the top of the stack.
     */
    public PlayingCard removeCard(){
        PlayingCard cardRemoved = setOfCards.remove(numberOfCards - 1);
        numberOfCards--;
        return cardRemoved;
    }
    
    /**
     * Add cardTOAdd into the set of playing_cards.
     */
    public void addCard(PlayingCard cardToAdd){
        setOfCards.add(cardToAdd);
        numberOfCards++;
    }

    /**
     * Return True if the set of cards contains card.
     */
    public boolean contains(PlayingCard card){
        return setOfCards.contains(card);
    }

    /**
     * Remove all the cards from the set of cards
     */
    public void destroy(){
        setOfCards.clear();
        numberOfCards = 0;
    }

    public Deck clone(){
        ArrayList<PlayingCard> newSetOfCards = new ArrayList<>();
        for (PlayingCard card : setOfCards){
            newSetOfCards.add(card.clone());
        }
        return new Deck(newSetOfCards);
    }

    public ArrayList<PlayingCard> getSetOfCards(){
        return setOfCards;
    }

    public int getNumberOfCards(){
        return numberOfCards;
    }
}