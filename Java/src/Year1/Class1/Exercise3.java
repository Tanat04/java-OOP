package Year1.Class1;

import java.util.Scanner;

public class Exercise3 {

    /**
     *Exercise3: learn how to ask a user input with scanner.
     */

    public static void main(String[] args) {

        Scanner tanatRead = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = tanatRead.nextLine();

        System.out.print("what programming language you are learning: ");
        String language = tanatRead.nextLine();

        System.out.print("Enter your age: ");
        byte age = tanatRead.nextByte();

        System.out.println();
        System.out.println("My full name is " + name + ".");
        System.out.print("I am " + age + " years old.\n");
        System.out.println("Am a " + language + " learner.");

        tanatRead.close();
    }

}
