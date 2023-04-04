package Year1.Class2;

public class CharacterProcessing1 {

    public static void main(String[] args) {

        System.out.println("According to Character.isDigit:");
        char checkIsDigit = 72;
        if (Character.isDigit(checkIsDigit)) {
            System.out.println(checkIsDigit + " is a digit");
        } else {
            System.out.println(checkIsDigit + " is not a digit");
        }

        System.out.println();
        System.out.println("According to Character.isLetter:");
        char checkIsLetter = '$';
        if (Character.isLetter(checkIsLetter)) {
            System.out.println(checkIsLetter + " is a letter");
        } else {
            System.out.println(checkIsLetter + " is not a letter");
        }

        System.out.println();
        System.out.println("According to Character.isLetterOrDigit:");
        char checkIsLetterOrDigit = '*';
        if (Character.isLetterOrDigit(checkIsLetterOrDigit)) {
            System.out.println(checkIsLetterOrDigit + " is a letter or a digit");
        } else {
            System.out.println(checkIsLetterOrDigit + " is not a letter or a digit");
        }
    }
}