package Year1.Class6;

public class circle extends geometricObject {

    private double radius;

    public circle(){

    }

    circle(double radius) {
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return getDiameter() * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor("Blue");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}