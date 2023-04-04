package Year1.Class9_inteface;

public class VMS implements faculty {
    @Override
    public String getUniversity() {
        return "Assumption University";
    }

    @Override
    public String getName() {
        return "Vincent Mary School of Science and Technology";
    }

    @Override
    public String getBuilding() {
        return "VMS Building";
    }
}