package Year1.Class5;

public class Exercise4_dicegame {

    public static void main(String[] args) {

        DiceGame game = new DiceGame(4);
        int score = game.play();
        System.out.println("Score " + score);

        DiceGame game1 = new DiceGame();
        int score1 = game1.play();
        System.out.println("Score1 " + score1);

    }

}