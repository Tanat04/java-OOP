package Year1.exam.midterm;

public class MQ2_6410381 {
    public static String removeStars(String s) {

        String replaceStar = s.replace("star","*");

        String result = "";
        for (int i = 0; i < replaceStar.length(); i++) {
            if(!('*' == replaceStar.charAt(i)
                    || i+ 1 < replaceStar.length() && '*' == replaceStar.charAt(i+1)
                    || i > 0 && '*' == replaceStar.charAt(i-1))){
                result = result + replaceStar.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeStars("a*b"));
        System.out.println(removeStars("a*a*bb*bb"));
        System.out.println(removeStars("*test*"));
        System.out.println(removeStars("ng"));
        System.out.println(removeStars("juststartexam"));
        System.out.println(removeStars("jstartexam"));
        System.out.println(removeStars("ok*let"));
        System.out.println(removeStars("ples*se"));
        System.out.println(removeStars("idont*know"));
        System.out.println(removeStars("examsstarpple"));

    }
}
