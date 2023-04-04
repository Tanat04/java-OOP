package Year1.exam.quiz1;

public class Quiz1Q1 {

    public static void main(String[] args) {

        int n = 7;
        int arr[] = new int[] {12, 5, 100, 5};

        boolean result = hasNN(n , arr);
        System.out.println(result);

    }//main

    public static boolean hasNN(int N, int[] arr) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                if (i + 1 == arr.length) {
                    check = true;
                }
                if (i == arr.length - 3) {
                    if (arr[i] + 1 == N || arr[i + 2] == N) {
                        check = true;
                    }
                }
                if (i == arr.length - 2) {
                    if (arr[i] + 1 == N) {
                        check = true;
                    }
                }
                if (arr[i + 1] == N || arr[i + 2] == N) {
                    check = true;
                }
            }
        }
        return check;
    }
}//class
