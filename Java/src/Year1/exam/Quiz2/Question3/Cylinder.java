package Year1.exam.Quiz2.Question3;

public class Cylinder extends Circle{

    //Data members
    private double height = 1.0;

    // Constructors
    public Cylinder(){

    }

    public Cylinder(double radius){
        setRadius(radius);
    }

    public Cylinder(double radius, double height){
        setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        setRadius(radius);
        setColor(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + getRadius()+
                ", color=" + getColor()+
                '}';
    }

}
