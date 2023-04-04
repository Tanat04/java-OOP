package Year1.Class1;

import java.util.Scanner;

public class Exercise5 {

    /**
     * Exercise5: Learn to use if-else statement.
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = reader.nextInt();

        if(age < 18){
            System.out.println("Sorry! You are too young to enter.");
        }
        else{
            System.out.println("Enjoy!");
        }
        reader.close();
    }

}
