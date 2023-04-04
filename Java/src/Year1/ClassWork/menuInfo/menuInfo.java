package Year1.ClassWork.menuInfo;

public abstract class menuInfo {
    private String name;
    private double rating;
    public abstract String description();
    public abstract double price();
    public abstract int timeToPrepare();
    public abstract boolean isSpicy();

    public menuInfo(String name, double rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
