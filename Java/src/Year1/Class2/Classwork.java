package Year1.Class2;

import java.util.Random;
import java.util.Scanner;

public class Classwork {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = reader.nextInt();
        System.out.println(IsPositiveOrNegative(num));

        System.out.println("*---------------------------------*");

        System.out.print("Enter a first number: ");
        int a = reader.nextInt();

        System.out.print("Enter a second number: ");
        int b = reader.nextInt();

        System.out.println();

        System.out.println(LargerNumber(a,b)+" is a larger number.");

        System.out.println("*---------------------------------*");

        System.out.print("Enter a third number: ");
        int c = reader.nextInt();

        System.out.println();

        System.out.println(LargerNumberFromThree(a,b,c)+" is a largest number using if and else.");

        System.out.println("*---------------------------------*");

        System.out.println(LargerNumberUsingMax(a,b,c)+" is a largest number using Math.max().");

        System.out.println("*---------------------------------*");

        System.out.print("Enter the number of dices: ");
        int numberOfDices = reader.nextInt();

        System.out.println();

        System.out.print("You got: ");

        System.out.println(RollDice(numberOfDices));

        System.out.println("*---------------------------------*");


        reader.close();
    }
    public static String IsPositiveOrNegative(int a) {
        if(a >= 0){
            return (a + " is a positive integer.");
        }else{
            return (a + " is a negative integer.");
        }
    }
    public static int LargerNumber(int a, int b) {
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
    public static int LargerNumberFromThree(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
    public static int LargerNumberUsingMax(int a, int b, int c) {
        int calculation = Math.max(a,Math.max(b,c));
        if(calculation == a){
            return a;
        }else if (calculation == b){
            return b;
        }else {
            return c;
        }
    }
    public static String RollDice(int a) {
        Random ranNum = new Random();
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < a; i++) {
            randomNumber = ranNum.nextInt(6) + 1;
            total += randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }
        System.out.println("");
       return ("Total: "+ total);
    }
}
