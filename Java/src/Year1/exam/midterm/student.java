package Year1.exam.midterm;

public class student {

    private String id;
    private String firstname;
    private String lastname;
    private int[] scores;

    public student(String id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        scores = new int[] {0,0,0,0,0};
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getScore(int testNumber) {
        return scores[testNumber];
    }

    public boolean setScore(int testNumber, int score) {
        if(testNumber < 0 || testNumber >= scores.length){
            return false;
        }
        if( score > 5 || score < 0){
            return false;
        }
        scores[testNumber] = score;
        return true;
    }

    public double totalScore(){
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return total;
    }

    @Override
    public String toString() {
        return getId() +" "+ getFirstname() +" "+ getLastname();
    }
}
