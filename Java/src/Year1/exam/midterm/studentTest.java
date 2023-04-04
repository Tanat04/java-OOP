package Year1.exam.midterm;

public class studentTest {

    public static void main(String[] args) {

        student undergrade = new undergraduate("6410381", "Tanat", "Arora");
        System.out.println(undergrade.getId());
        System.out.println(undergrade.getFirstname());
        System.out.println(undergrade.getLastname());
        System.out.println(undergrade.getScores());
        undergrade.setScore(0,5);
        undergrade.setScore(1,1);
        undergrade.setScore(2,4);
        undergrade.setScore(3,3);
        System.out.println(undergrade.setScore(4,7));
        undergrade.setScore(4,3);
        for (int i = 0; i < 5; i++) {
            System.out.println(undergrade.getScore(i));
        }
        System.out.println("Total score: "+undergrade.totalScore());
        System.out.println(undergrade.toString());

        System.out.println();
        System.out.println();


        student graduategrade = new graduate("6410381", "Tanat", "Arora");
        System.out.println(graduategrade.getId());
        System.out.println(graduategrade.getFirstname());
        System.out.println(graduategrade.getLastname());
        System.out.println(graduategrade.getScores());
        graduategrade.setScore(0,6);
        graduategrade.setScore(1,4);
        graduategrade.setScore(2,2);
        graduategrade.setScore(3,2);// wrong, make it print -1

        for (int i = 0; i < 4; i++) {
            System.out.println(graduategrade.getScore(i));
        }
        System.out.println("Total score: "+graduategrade.totalScore());
        System.out.println(graduategrade.toString());

    }//Main

}//Class
