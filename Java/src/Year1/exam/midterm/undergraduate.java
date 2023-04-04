package Year1.exam.midterm;

public class undergraduate extends student{

    private String seniorProjectTitle;

    public undergraduate(String id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    public String getSeniorProjectTitle() {
        return seniorProjectTitle;
    }

    public void setSeniorProjectTitle(String seniorProjectTitle) {
        this.seniorProjectTitle = seniorProjectTitle;
    }

    @Override
    public double totalScore() {
        return super.totalScore()/5;
    }

    @Override
    public String toString() {
        return getId() + " Undergraduate " + totalScore();
    }
}
