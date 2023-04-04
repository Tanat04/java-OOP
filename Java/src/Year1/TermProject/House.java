package Year1.TermProject;

public class House extends RentPlan{

    //Data Members with its own value
    double price = 15000.00;
    int months = 36;
    double electricityBills = 800;
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
        System.out.println("The House have two floor.");
    }

    @Override
    public void getSize() {
        System.out.println("The size of the house is 1,205 square feet.");
    }

    @Override
    public void getRooms() {
        System.out.println("Theres are three rooms in the house:\n\tOne living room on the first floor.\n\tTwo bedroooms on the second floor.");
    }

    @Override
    public void getBahtrooms() {
        System.out.println("There are two bahtrooms in the house, one each floor.");
    }

    // toString, I used only this method to print out the output as it have all the method already.
    @Override
    public String toString() {
        return  "\nPrice for renting house per month is = " + getPrice() + " Bahts" +
                "\nYou are staying for " + getMonths() + " months" +
                "\nElectricity bills per month is = " + getElectricityBills() + " Bahts" +
                "\nWater bills per month is = " + getWaterBills() + " Bahts" +
                "\nTotal price is = " + CalculateBills() + " Bahts";
    }
}
