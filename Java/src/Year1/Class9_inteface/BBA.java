package Year1.Class9_inteface;

public class BBA implements faculty{
    @Override
    public String getUniversity() {
        return "Assumption University";
    }

    @Override
    public String getName() {
        return "Business Administration";
    }

    @Override
    public String getBuilding() {
        return "MSME Building";
    }
}
