package Year1.TermProject;

public abstract class RentPlan extends PlaceInformation {

    //Data Members
    private double price;
    private int months;
    private double electricityBills;
    private double waterBills;

    //Methods
    public double getPrice() {
        return price;
    }

    public int getMonths() {
        return months;
    }

    public double getElectricityBills() {
        return electricityBills;
    }

    public double getWaterBills() {
        return waterBills;
    }

    public abstract void setMonths(int months);

    public abstract double CalculateBills();
}
