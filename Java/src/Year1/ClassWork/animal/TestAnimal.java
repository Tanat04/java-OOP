package Year1.ClassWork.animal;

public class TestAnimal {

    public static void main(String[] args) {

        // Using the subClasses
        Cat cat1 = new Cat("Chutiya");
        cat1.greets();
        Dog dog1 = new Dog("khutta");
        dog1.greets();
        dog1.greets(dog1);
        BigDog bigDog1 = new BigDog("bara khutta");
        bigDog1.greets();



        bigDog1.greets(dog1);
        bigDog1.greets(bigDog1);

        // Using Polymorphism
        Animal animal1 = new Cat("cat1");
        animal1.greets();
        Animal animal2 = new Dog("dog1");
        animal2.greets();
        Animal animal3 = new BigDog("BigDog1");
        animal3.greets();

    }
}
