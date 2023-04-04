package Year1.exam.finalexam.Q2_6410381;

public class Q2Main {

    public static void main(String[] args) {

        GeneralMessage general = new GeneralMessage();
        general.setMessage("Hello World");
        general.printGoodFormat();

        System.out.println("====== ====== ======");

        EnAMessage m1 = new EnAMessage("Hello");
        m1.encrypt();
        System.out.println(m1.getMessage());
        m1.encrypt();
        m1.printGoodFormat();

        System.out.println("====== ====== ======");

        EnBMessage m2 = new EnBMessage("Hello");
        m2.printGoodFormat();
        m2.encrypt();
        System.out.println(m2.getMessage());

        System.out.println("====== ====== ======");

        HiddenInt num = new HiddenInt(12);
        num.encrypt();
        num.setNumber(32);
        num.encrypt();



    }
}
