package Year1.Class5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CashVoucher {

    String code;
    double amount;
    String expiryDate;

    CashVoucher(String code, double amount, String expiryDate) {
        this.code = code;
        this.amount = amount;
        this.expiryDate = expiryDate;
    }

    void redeem(double amountToBeCut) throws ParseException {
        if (checkValidity()) {
            if (amount < amountToBeCut) {
                System.out.println("Insufficient Balance");
            } else {
                amount -= amountToBeCut;
                System.out.println("Transaction Approved");
                System.out.println("Balance left are: "+ amount);
            }
        } else {
            System.out.println("Voucher Expired");
        }
    }

    void printBalance() {
        System.out.println("Balance: " + amount);
    }

    boolean checkValidity() throws ParseException {
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date expiryDate = sdf.parse(this.expiryDate);

        if (today.after(expiryDate)) {
            return false;
        } else {
            return true;
        }
    }

}