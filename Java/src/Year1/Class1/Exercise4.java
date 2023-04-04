package Year1.Class1;

import java.util.Scanner;

public class Exercise4 {

    /**
     * Exercise: Getting familiar with aritmetric operators.
     */

    public static void main(String[] args) {

        Scanner askInput = new Scanner(System.in);

        System.out.print("Input height: ");
        double height = askInput.nextDouble();

        System.out.print("Input width: ");
        float width = askInput.nextFloat();

        System.out.println();
        int area = (int) (height * width);

        System.out.print("The area is "+ area + ".");

        askInput.close();
    }

}
