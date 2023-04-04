package Year1.exam.Quiz2.Question2;

import Year1.exam.Quiz2.Question1.Circle;

public class HollowCylinder extends Circle {

    //Data members
    private double height = 1.0;
    private double outerRadius = 9.0;

    // Constructors
    public HollowCylinder(){

    }

    public HollowCylinder(double radius){
        setRadius(radius);
    }

    public HollowCylinder(double radius, double outerRadius){
        setRadius(radius);
        this.outerRadius = outerRadius;
    }

    public HollowCylinder(double radius, double outerRadius, double height) {
        setRadius(radius);
        this.outerRadius = outerRadius;
        this.height = height;
    }

    public HollowCylinder(double radius, double outerRadius, double height, String color){
        setRadius(radius);
        setColor(color);
        this.outerRadius = outerRadius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(double outerRadius) {
        this.outerRadius = outerRadius;
    }

    public double getVoloume() {
        return Math.PI * (Math.pow(outerRadius, 2) - Math.pow(getRadius(), 2)) * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", outer radius=" + outerRadius+
                ", height=" + getHeight()+
                ", color=" + getColor()+
                '}';
    }
}
