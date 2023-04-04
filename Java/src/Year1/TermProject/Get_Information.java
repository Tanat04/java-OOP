package Year1.TermProject;

import java.io.IOException;
import java.util.Scanner;

public class Get_Information {

    public static void main(String[] args) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();

        Scanner reader = new Scanner(System.in);

        // Person 1
        System.out.print("\nPerson 1, What do you want to rent: ");
        String planName1 = reader.nextLine();

        System.out.print("You wish to pay the rent with 'Credit Card' or 'PayPal': ");
        String paymentName1 = reader.nextLine();

        RentPlan rent1 = planFactory.getPlan(planName1);
        System.out.println("\nThe information for the " + planName1 + " that you want to rent:");
        // We print the planName1 as String
        rent1.PLACEINFO();
        //This is from PlaceInformation final method
        System.out.println("\nPrice information for renting " + planName1 + ": " + rent1);

        if (paymentName1.equalsIgnoreCase("credit card") || paymentName1.equalsIgnoreCase("CreditCard")){
            CreditCardStrategy payment1 = new CreditCardStrategy("Tanat Arora","23/02/2026", "1234567890", "555");
            System.out.println("\nPayment information for renting " + planName1 + " using " + paymentName1 + ": " + payment1);

        }else{
            PayPalStrategy payment1 = new PayPalStrategy("Tanat.navin@gmail.com","Tanat04", "Thisismypassword");
            System.out.println("\nPayment information for renting " + planName1 + " using " + paymentName1 + ": " + payment1);
        }
        // If else is use because if the user want credsit card it will create new credit card method not the Payment method(parent class)
        // If so we wont have access to the data member of its sub-class.


        // Person 2 and Person 3 are same as person1 just different input from user.
        // Person 2
        System.out.print("\nPerson 2, What do you want to rent: ");
        String planName2 = reader.nextLine();

        System.out.print("You wish to pay the rent with 'Credit Card' or 'PayPal': ");
        String paymentName2 = reader.nextLine();

        RentPlan rent2 = planFactory.getPlan(planName2);
        rent2.setMonths(120);
        System.out.println("\nThe information for the " + planName2 + " that you want to rent:");
        rent2.PLACEINFO();
        System.out.println("\nPrice information for renting " + planName2 + ": " + rent2);

        if (paymentName2.equalsIgnoreCase("credit card") || paymentName2.equalsIgnoreCase("CreditCard")){
            CreditCardStrategy payment2  = new CreditCardStrategy("Handsome Guy","02/11/2099", "7743388222", "123");
            System.out.println("\nPayment information for renting " + planName2 + " using " + paymentName2 + ": " + payment2);

        }else{
            PayPalStrategy payment2 = new PayPalStrategy("u6410381@au.edu","6410381", "Universityaccount");
            System.out.println("\nPayment information for renting " + planName2 + " using " + paymentName2 + ": " + payment2);
        }

        // Person 3
        System.out.print("\nPerson 3, What do you want to rent: ");
        String planName3 = reader.nextLine();

        System.out.print("You wish to pay the rent with 'Credit Card' or 'PayPal': ");
        String paymentName3 = reader.nextLine();

        RentPlan rent3 = planFactory.getPlan(planName3);
        rent3.setMonths(6);
        System.out.println("\nThe information for the " + planName3 + " that you want to rent:");
        rent3.PLACEINFO();
        System.out.println("\nPrice information for renting " + planName3 + ":" + rent3);

        if (paymentName3.equalsIgnoreCase("credit card") || paymentName3.equalsIgnoreCase("CreditCard")){
            CreditCardStrategy payment3  = new CreditCardStrategy("Invisible Man","2/22/2222", "1122334455", "222");
            System.out.println("\nPayment information for renting " + planName3 + " using " + paymentName3 + ": " + payment3);

        }else{
            PayPalStrategy payment3 = new PayPalStrategy("ILove_Coding@gmail.com","JavaGuy", "Thisisjavaaccount");
            System.out.println("\nPayment information for renting " + planName3 + " using " + paymentName3 + ": " + payment3);
        }
    }
}
