package Year1.ClassWork.menuInfo;

public class mainFood {
    public static void main(String[] args) {
        thaiCurry dish1 = new thaiCurry("แกงไทย",10);
        khaoPad dish2 = new khaoPad("ข็าวผัด", (int) 9.9);

        System.out.println("The dish name is: " + dish1.getName());
        System.out.println("Rating: "+ dish1.getRating());
        System.out.println("Price: "+ dish1.price()+" Baht");
        System.out.println("Dish's description: "+ dish1.description());
        System.out.println("This dish was found in the year "+ dish1.foundInYear());
        System.out.println("The name of the cook is: "+ dish1.cookName());
        System.out.println("Is the dish spicy?: "+ dish1.isSpicy());
        System.out.println("How to eat the dish: "+ dish1.howToEat());
        System.out.println("How much time does it take to prepare: "+ dish1.timeToPrepare()+" Minutes");
        System.out.println("This is for "+ dish1.meals()+ " Course");
        System.out.println("This is a "+dish1.classfication());
        System.out.println();
        System.out.println();

        System.out.println("The dish name is: " + dish2.getName());
        System.out.println("Rating: "+ dish2.getRating());
        System.out.println("Price: "+ dish2.price()+" Baht");
        System.out.println("Dish's description: "+ dish2.description());
        System.out.println("This dish was found in the year "+ dish2.foundInYear());
        System.out.println("The name of the cook is: "+ dish2.cookName());
        System.out.println("Is the dish spicy?: "+ dish2.isSpicy());
        System.out.println("How to eat the dish: "+ dish2.howToEat());
        System.out.println("How much time does it take to prepare: "+ dish2.timeToPrepare()+" Minutes");
        System.out.println("This is for "+ dish2.meals()+ " Course");
        System.out.println("This is a "+dish2.classfication());

    }

}
