package Year1.exam.finalexam.Q1_6410381;

public class AString implements Complement{

    //data member
    private String str;

    // Constructor
    public AString(String str){
        this.str = str;
    }

    // Methods
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public Object takeCompliment() {
        String result = "";
        for(int i =0; i < str.length();i++){
            result += convertCompliment(str.charAt(i));
        }
        return result;
    }

    public char convertCompliment(char str){
        int inputAscii = (int) str;
        int tempAscii = (25 - (2 * (inputAscii - 97))) + inputAscii;
        char result = (char) tempAscii;
        return result;
    }
}