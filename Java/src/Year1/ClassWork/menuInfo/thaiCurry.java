package Year1.ClassWork.menuInfo;

public class thaiCurry extends menuInfo implements facts{

    private String color;

    public thaiCurry(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String howToEat() {
        return "With rice";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String classfication() {
        return "Main Course";
    }

    @Override
    public String meals() {
        return "Lunch or Dinner";
    }

    @Override
    public String cookName() {
        return "Mr.Tanat Arora";
    }

    @Override
    public int foundInYear() {
        return 1980;
    }

    @Override
    public String description() {
        return "corn,carrot,water,khati";
    }

    @Override
    public double price() {
        return 80;
    }

    @Override
    public int timeToPrepare() {
        return 20;
    }

    @Override
    public boolean isSpicy() {
        return true;
    }
}
