package Year1.ClassWork.phone;

public class iphone13 extends phone implements OperatingSystem {
    @Override
    public String operatingSystem() {
        return "IOS";
    }

    @Override
    public int camera() {
        return 3;
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getStorage() {
        return super.getStorage();
    }

    @Override
    public int getRam() {
        return super.getRam();
    }

}
