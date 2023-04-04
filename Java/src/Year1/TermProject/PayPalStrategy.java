package Year1.TermProject;

public class PayPalStrategy implements PaymentStrategy{

    //Data Members
    private String email;
    private String username;
    private String password;

    //Constructor
    public PayPalStrategy(String email, String username, String password){
        this.email = email;
        this.username = username;
        this.password = password;
    }

    //Methods
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String paymentStrategy() {
        return "Paying rent with PayPal.";
    }

    @Override
    public String toString() {
        return  "\n" + paymentStrategy() +
                "\nUser's email is = " + getEmail() +
                "\nUsername = " + getUsername() +
                "\nPassword = " + getPassword();
    }
}
