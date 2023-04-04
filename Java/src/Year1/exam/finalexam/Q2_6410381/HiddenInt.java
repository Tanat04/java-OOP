package Year1.exam.finalexam.Q2_6410381;

public class HiddenInt implements ICipher{

    private int number;

    public HiddenInt(int num){
        number = num;
    }
    // Methods

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void encrypt() {
        decimalToBinary(getNumber());
    }

    static void decimalToBinary(int num)
    {
        System.out.println(Integer.toBinaryString(num));
    }
}
