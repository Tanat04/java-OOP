package Year1.Class5;

import java.util.LinkedList;

public class CardGame {

    public static void main(String[] args) {

        Card card_ = new Card(2, "Spade");
        System.out.println("You got " + card_.getRank() +" of " + card_.getSuit() + "!");
        System.out.println();

        LinkedList<Card> player1Cards = new LinkedList<Card>();
        LinkedList<Card> player2Cards = new LinkedList<Card>();

        DeckOfCard game = new DeckOfCard();
        game.shuffle();
        game.shuffle();
        game.shuffle();
        game.shuffle();
        game.shuffle();
        game.shuffle();


        player1Cards.add(game.draw());
        player2Cards.add(game.draw());
        player1Cards.add(game.draw());
        player2Cards.add(game.draw());

        int player1Scores = player1Cards.get(0).getRank() + player1Cards.get(1).getRank();
        int player2Scores = player2Cards.get(0).getRank() + player2Cards.get(1).getRank();

        System.out.println("Player number 1 got: " + player1Cards.get(0).getRank() + " of " + player1Cards.get(0).getSuit() + " on the first draw!");
        System.out.println("Player number 1 got: " + player1Cards.get(1).getRank() + " of " + player1Cards.get(1).getSuit() + " on the second draw!");
        System.out.println();

        System.out.println("Player number 2 got: " + player2Cards.get(0).getRank() + " of " + player2Cards.get(0).getSuit() + " on the first draw!");
        System.out.println("Player number 2 got: " + player2Cards.get(1).getRank() + " of " + player2Cards.get(0).getSuit() + " on the second draw!");
        System.out.println();

        System.out.println("The total score of player number 1 is: "+ player1Scores);
        System.out.println("The total score of player number 2 is: "+ player2Scores);
        System.out.println();

        String result = (player1Scores > player2Scores)? ("Player 1 have won!") : ("Player 2 have won!");
        System.out.println(result);

    }//Main

}//Class
