package Year1.Class6;

import java.util.Date;

public class geometricObject extends Object {

    String color;
    private Boolean filled;
    private Date dateCreated;

   geometricObject() {
        System.out.println("GeometricObject constructor called");
        color = "white";
        filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "geometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}