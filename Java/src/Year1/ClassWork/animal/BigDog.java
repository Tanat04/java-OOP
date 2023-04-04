package Year1.ClassWork.animal;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof Woof, am big guy");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woof Woof, u small");
    }

    public void greets(BigDog another) {
        System.out.println("Woof Woof, BROTHER");
    }
}
