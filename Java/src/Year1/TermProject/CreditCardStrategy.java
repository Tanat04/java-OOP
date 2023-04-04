package Year1.TermProject;

public class CreditCardStrategy implements PaymentStrategy{

    //Data Members
    private String cardHolderName;
    private String expiryDate;
    private String cardNumber;
    private String CVV;

    //Constructor
    public CreditCardStrategy(String cardHolderName, String expiryDate, String cardNumber, String CVV){
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
    }

    //Methods
    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    @Override
    public String paymentStrategy() {
        return "Paying rent with Credit Card.";
    }

    @Override
    public String toString() {
        return  "\n" + paymentStrategy() +
                "\nCredit Card holder name is Mr = " + getCardHolderName() +
                "\nCard expiry data =  " + getExpiryDate() +
                "\nCard number = " + getCardNumber() +
                "\nCard verification value code(CVV) is  = " + getCVV();
    }
}
