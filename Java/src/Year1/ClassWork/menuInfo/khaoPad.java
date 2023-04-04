package Year1.ClassWork.menuInfo;

public class khaoPad extends menuInfo implements facts{
    public khaoPad(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String howToEat() {
        return "with your mouth";
    }

    @Override
    public String classfication() {
        return "lunch or dinner";
    }

    @Override
    public String meals() {
        return "Main";
    }

    @Override
    public String cookName() {
        return "Mr. Handsome Guy";
    }

    @Override
    public int foundInYear() {
        return 3030;
    }

    @Override
    public String description() {
        return "Very Tasty";
    }

    @Override
    public double price() {
        return 60;
    }

    @Override
    public int timeToPrepare() {
        return 20;
    }

    @Override
    public boolean isSpicy() {
        return false;
    }
}
