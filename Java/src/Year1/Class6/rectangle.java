package Year1.Class6;

public class rectangle extends geometricObject{

    private double width;
    private double height;

    public rectangle() {

    }

    public rectangle(double width, double height) {
        System.out.println("Rectangle constructor called");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width + width + height + height;
    }
}
