package Year1.ClassWork.strudent_abstract;

public class Graduate extends Student {

    private String thesisTitle;

    Graduate(String id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public int getScore(int testNumber) {
        if (testNumber < 0 || testNumber >= 3) {
            return -1; // Assume that -1 is an invalid number
        }
        return getScores()[testNumber];
    }

    @Override
    public boolean setScore(int testNumber, int score) {
        if (testNumber < 0 || testNumber >= 3) {
            return false; // Assume that -1 is an invalid number
        }
        if (score < 0 || score > 10) {
            return false;
        }
        getScores()[testNumber] = score;
        return true;
    }

    @Override
    public int totalScore() {
        return (getScore(0) + getScore(1) + getScore(2)) / 3;
    }

    @Override
    public String toString() {
        return getId() + " Graduate " + totalScore();
    }
}
