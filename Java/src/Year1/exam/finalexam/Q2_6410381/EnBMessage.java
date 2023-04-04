package Year1.exam.finalexam.Q2_6410381;

public class EnBMessage extends Message implements ICipher{

    public EnBMessage(String m){
        setMessage(m);
    }

    @Override
    public void printGoodFormat() {
        System.out.println("Encryption B: "+ super.getMessage());
    }

    @Override
    public void encrypt() {
        cipher(getMessage(), 2);
    }

    public void cipher(String msg, int shift){
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + shift);
            if (c > 'z')
                s += (char)(msg.charAt(x) - (26-shift));
            else
                s += (char)(msg.charAt(x) + shift);
        }
        setMessage(s);
    }
}
