package Year1.exam.finalexam.Q2_6410381;

public class EnAMessage extends Message implements ICipher{

    public EnAMessage(String m){
        setMessage(m);
    }

    @Override
    public void printGoodFormat() {
        System.out.println("Encryption A: "+ super.getMessage());
    }

    @Override
    public void encrypt() {
        String str = getMessage(), reverse = "";
        char ch;

        for (int i = 0; i < getMessage().length(); i++) {
            ch = str.charAt(i);
            reverse = ch + reverse;
        }
        setMessage(reverse);
    }
}
