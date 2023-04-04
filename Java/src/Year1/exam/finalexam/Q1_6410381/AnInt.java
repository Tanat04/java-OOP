package Year1.exam.finalexam.Q1_6410381;

public class AnInt implements Complement {

    // Data member
    private int number;

    // Constructors
    public AnInt(int number){
        this.number = number;
    }

    // Methods
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Object takeCompliment() {
        String bin = Integer.toBinaryString(number);
        String binResult = "";
        for(int i =0; i < bin.length();i++){
            if(bin.charAt(i) == '1'){
                binResult += '0';
            } else{
                binResult += '1';
            }
        }
        return Integer.parseInt(binResult,2);
    }
}
