package Year2.Final;

public class Main {

    public static void main(String[] args) {

        berry berry = new berry();
        System.out.println(berry.taste());
        strawberry strawberry = new strawberry();
        System.out.println(strawberry.taste());
        apple apple = new apple();
        System.out.println(apple.taste());

        Fruit berry1 = new berry();
        System.out.println(berry1.taste());
        Fruit strawberry1 = new strawberry();
        System.out.println(strawberry1.taste());
        Fruit apple1 = new apple();
        System.out.println(apple1.taste());
    }
}
