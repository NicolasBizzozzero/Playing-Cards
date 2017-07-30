import playing_cards.*;

public class Main{
    public static void main(String[] args){
        PlayingCard card1 = new PlayingCard(CardNumber.TWO, Color.CLUBS);
        System.out.println(card1.toString());
    }
}