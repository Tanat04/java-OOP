package Year1.TermProject;

public class Condo extends RentPlan{

    //Data Members with its own value
    double price = 13000.00;
    int months = 30;
    double electricityBills = 200;
    double waterBills = 550;

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
        System.out.println("The Condo have one floor.");
    }

    @Override
    public void getSize() {
        System.out.println("The size of the condo is 880 square feet.");
    }

    @Override
    public void getRooms() {
        System.out.println("Theres are two rooms in the condo and living areas.");
    }

    @Override
    public void getBahtrooms() {
        System.out.println("There are one bahtrooms in the condo");
    }

    // toString, I used only this method to print out the output as it have all the method already.
    @Override
    public String toString() {
        return  "\nPrice for renting condo per month is = " + getPrice() + " Bahts" +
                "\nYou are staying for " + getMonths() + " months" +
                "\nElectricity bills per month is = " + getElectricityBills() + " Bahts" +
                "\nWater bills per month is = " + getWaterBills() + " Bahts" +
                "\nTotal price is = " + CalculateBills() + " Bahts";
    }
}
