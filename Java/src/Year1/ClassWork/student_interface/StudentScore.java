package Year1.ClassWork.student_interface;

public interface StudentScore {

    int getScore(int testNumber);
    boolean setScore(int testNumber, int score);
    int totalScore();

}