package Year1.Class5;

import java.util.Collections;
import java.util.LinkedList;

public class DeckOfCard {

    private LinkedList<Card> cards;

    public DeckOfCard(){
        cards = new LinkedList<Card>();

        // Spades
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Spades"));
        }

        // Diamonds
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Diamonds"));
        }

        // Hearts
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Hearts"));
        }

        // Clubs
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "Clubs"));
        }
    }

    public Card draw(){
        Card card = cards.removeFirst();
        return card;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}//Class
