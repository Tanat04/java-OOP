package Year1.Class3;

public class Exercise3 {

    public static void main(String[] args) {

        int studentIds[] = new int[] {1000,1001,1002,1003,1004};


        System.out.println(studentIds);
        System.out.println(studentIds[0]);
        resetArrayInt(studentIds);
        System.out.println(studentIds[0]);
    }

    public static void resetArrayInt(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
    }
}