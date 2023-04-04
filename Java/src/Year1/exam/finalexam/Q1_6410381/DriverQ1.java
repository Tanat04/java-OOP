package Year1.exam.finalexam.Q1_6410381;

public class DriverQ1 {
    public static void main(String[] args){
        AnInt myInt = new AnInt(78);
        int[] testInt = {12, 16, 19, 23, 27, 33, 38, 44, 55, 69};
        System.out.println("myInt Tests:");
        int num = 1;
        for(int number:testInt){
            myInt.setNumber(number);
            System.out.println(num+ ") myInt.getNumber() = " + myInt.getNumber());
            System.out.println("Compliment myInt result = " + myInt.takeCompliment());
            num += 1;
            System.out.println();
        }

        AString myString = new AString("s");
        String[] testString = {"question", "number", "two", "was", "alot", "easier", "than", "this", "one"};
        System.out.println("\nmyString Tests");
        int num1 = 1;
        for(String str: testString){
            myString.setStr(str);
            System.out.println(num1+") myString.getStr() = " + myString.getStr());
            System.out.println("Compliment AString result = " + myString.takeCompliment());
            num1 += 1;
            System.out.println();
        }


    }
}
