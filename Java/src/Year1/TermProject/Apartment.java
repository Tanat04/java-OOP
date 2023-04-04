package Year1.TermProject;

public class Apartment extends RentPlan{

    //Data Members with its own value
    double price = 3000.00;
    int months = 12;
    double electricityBills = 300;
    double waterBills = 200;

    // Override method from RentPlan class
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getMonths() {
        return months;
    }

    @Override
    public double getElectricityBills() {
        return electricityBills;
    }

    @Override
    public double getWaterBills() {
        return waterBills;
    }

    @Override
    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public double CalculateBills() {
        return (getPrice() + getWaterBills() + getElectricityBills()) * getMonths();
    }

    // Override methods from Get_Information
    @Override
    public void getStories() {
        System.out.println("The Apartment have only one floor.");
    }

    @Override
    public void getSize() {
        System.out.println("The size of the Apartment is 600 square feet.");
    }

    @Override
    public void getRooms() {
        System.out.println("The apartment have only one big rooms with bed and living areas include.");
    }

    @Override
    public void getBahtrooms() {
        System.out.println("There are one bahtrooms in the Apartment");
    }

    // toString, I used only this method to print out the output as it have all the method already.
    @Override
    public String toString() {
        return  "\nPrice for renting Apartment per month is = " + getPrice() + " Bahts" +
                "\nYou are staying for " + getMonths() + " months" +
                "\nElectricity bills per month is = " + getElectricityBills() + " Bahts" +
                "\nWater bills per month is = " + getWaterBills() + " Bahts" +
                "\nTotal price is = " + CalculateBills() + " Bahts";
    }
}
