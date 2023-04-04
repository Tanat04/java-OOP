package Year1.exam.midterm;

public class graduate extends student {

    private String thesisTitle;

    public graduate(String id, String firstname, String lastname) {
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
        if( testNumber < 0 || testNumber >=3){
            return -1;
        }
        return super.getScore(testNumber);
    }

    @Override
    public boolean setScore(int testNumber, int score) {
        if( testNumber < 0 || testNumber >=3){
            return false;
        }
        if(score< 0 || score > 10){
            return false;
        }
        return super.setScore(testNumber, score);
    }

    @Override
    public double totalScore() {
        return super.totalScore() / 3;
    }

    @Override
    public String toString() {
        return getId() + " Graduate " + totalScore();
    }
}